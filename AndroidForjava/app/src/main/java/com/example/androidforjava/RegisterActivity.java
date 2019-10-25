package com.example.androidforjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText userNameText;
    EditText passwordText;
    EditText checkPasswordText;
    EditText phoneText;
    EditText verificationCodeText;
    Button getVerificationButton;
    Button applyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    private void init(){
        userNameText = findViewById(R.id.username_edit);
        passwordText = findViewById(R.id.password_edit);
        checkPasswordText = findViewById(R.id.check_password_edit);
        phoneText = findViewById(R.id.phone_edit);
        verificationCodeText = findViewById(R.id.verification_code_edit);
        getVerificationButton = findViewById(R.id.get_verification_code_btn);
        applyButton = findViewById(R.id.apply);

        getVerificationButton.setOnClickListener(this);
        applyButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.get_verification_code_btn:
                getVerificationButton.setClickable(false);
                timer.start();
                break;
            case R.id.apply:
                String userName = userNameText.getText().toString().trim();
                String password = passwordText.getText().toString().trim();
                String checkPassword = checkPasswordText.getText().toString().trim();
                String phone = phoneText.getText().toString().trim();
                String verificationCode = verificationCodeText.getText().toString().trim();
                String rex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
                if (userName.equals(""))
                    Toast.makeText(this,"用户名不能为空", Toast.LENGTH_SHORT).show();
                else if (password.equals(""))
                    Toast.makeText(this,"密码不能为空", Toast.LENGTH_SHORT).show();
                else if (!password.equals(checkPassword))
                    Toast.makeText(this,"两次密码不一致", Toast.LENGTH_SHORT).show();
                else if (!phone.matches(rex))
                    Toast.makeText(this,"手机号有误", Toast.LENGTH_SHORT).show();
                else if (userName.equals("aaa") && verificationCode.equals("123")){
                    Intent intent = new Intent(this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                break;
        }
    }

    CountDownTimer timer = new CountDownTimer(60 * 1000, 1000) {
        @Override
        public void onTick(long millisUntilFinished) {
            getVerificationButton.setText(millisUntilFinished / 1000 + "s");
        }

        @Override
        public void onFinish() {
            getVerificationButton.setText("点击获取验证码");
            getVerificationButton.setClickable(true);
        }
    };
}
