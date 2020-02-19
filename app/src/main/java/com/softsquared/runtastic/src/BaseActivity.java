package com.softsquared.runtastic.src;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.softsquared.runtastic.R;

import java.util.ArrayList;

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    public ProgressDialog mProgressDialog;
    public static ArrayList<Activity> mActList = new ArrayList<>();

    public void showCustomToast(final String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage(getString(R.string.loading));
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        hideProgressDialog();
    }

    public void activityFinish() {
        for(int i = 0; i < mActList.size(); i++){
            mActList.get(i).finish();
            mActList.remove(i);
        }
    }

    public void activityRemove(Activity activity) {
        for(int i = 0; i < mActList.size(); i++){
            if(mActList.get(i) == activity){
                mActList.remove(i);
            }
        }
    }
}
