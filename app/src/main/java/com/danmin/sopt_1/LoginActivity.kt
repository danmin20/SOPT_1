package com.danmin.sopt_1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_btn.setOnClickListener {
            if (login_email.text.isNullOrBlank() || login_pw.text.isNullOrBlank()) {
                Toast.makeText(this, "이메일과 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivityForResult(intent, 100)
            }
        }
        gotoJoin.setOnClickListener {
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            Log.d("tag",requestCode.toString())
            when (requestCode){
                100 -> {
                    val savedEmail = data!!.getStringExtra("email").toString()
                    login_email.setText(savedEmail)
                    val savedPw = data!!.getStringExtra("password").toString()
                    login_pw.setText(savedPw)
                }
            }
        }
    }
}
