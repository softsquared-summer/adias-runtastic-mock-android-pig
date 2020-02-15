package com.softsquared.template.src.login;

import android.os.Bundle;
import android.view.View;

import com.softsquared.template.R;
import com.softsquared.template.src.BaseActivity;
import com.softsquared.template.src.login.interfaces.SignUpActivityView;

public class SignUpActivity extends BaseActivity implements SignUpActivityView {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void customOnClick(View view) {
        switch (view.getId()) {
            case R.id.sign_up_btn_profile_img:
                break;
            case R.id.sign_up_btn_join_top:
                break;
            case R.id.sign_up_btn_join_bottom:
                break;
            case R.id.sign_up_btn_back:
                finish();
                break;
            default:
                break;
        }
    }
}
