package com.example.fudoprox

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge


class OnBoardActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard)


        val getStartedBtn = findViewById<Button>(R.id.getStartedBtn)
        getStartedBtn.visibility = View.INVISIBLE

        getStartedBtn.postDelayed({
            getStartedBtn.visibility = View.VISIBLE
        },3000)


        getStartedBtn.setOnClickListener{
            val intent = Intent(this@OnBoardActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }




}