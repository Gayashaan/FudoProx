package com.example.fudoprox

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge

class SignupActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

//        val loginBtn = findViewById<TextView>(R.id.loginAcc)


    }

    fun buttonClick(v: View){
        val intent = Intent(this@SignupActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}