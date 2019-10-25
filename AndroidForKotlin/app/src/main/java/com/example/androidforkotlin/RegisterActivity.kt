package com.example.androidforkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init()
    }

    private fun init(){
        getVerificationCodeButtn.setOnClickListener(this)
        applyButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.getVerificationCodeButtn -> {
                getVerificationCodeButtn.isClickable = false
                timer.start()
            }
            R.id.applyButton -> {
                val userName = usernameEdit.text.toString().trim()
                val password = passwordEdit.text.toString().trim()
                val checkPassword = checkPasswordEdit.text.toString().trim()
                val phone = phoneEdit.text.toString().trim()
                val verificationCode = verificationCodeEdit.text.toString().trim()
                val rex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$"
                if (userName == "")
                    Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show()
                else if (password == "")
                    Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show()
                else if (password != checkPassword)
                    Toast.makeText(this, "两次密码不一致", Toast.LENGTH_SHORT).show()
                else if (!phone.matches(rex.toRegex()))
                    Toast.makeText(this, "手机号有误", Toast.LENGTH_SHORT).show()
                else if (userName == "aaa" && verificationCode == "123") {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
    private var timer: CountDownTimer =
        object : CountDownTimer((60 * 1000).toLong(), (1 * 1000).toLong()) {
            override fun onTick(millisUntilFinished: Long) {
                getVerificationCodeButtn.text =  "${(millisUntilFinished / 1000)}s"
            }

            override fun onFinish() {
                getVerificationCodeButtn.text = "点击获取验证码"
                getVerificationCodeButtn.isClickable = true
            }
        }
}
