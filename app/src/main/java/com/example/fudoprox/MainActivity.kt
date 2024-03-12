package com.example.fudoprox

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }

    fun buttonClick(v: View){

        when(v.id){
            R.id.sellerBtn->{
                val intent = Intent(this@MainActivity, SignupActivity::class.java)
                startActivity(intent)
                finish()
            }
            R.id.brokerBtn->{
                val intent = Intent(this@MainActivity, AgentSignupActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}