package com.example.fudoprox

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AgentSignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agent_signup)


    }

    fun login(v: View){
        val intent = Intent(this@AgentSignupActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }


}