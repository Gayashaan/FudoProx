package com.example.fudoprox

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onBackPressed() {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit Confirmation")
        builder.setMessage("Are you sure you want to exit?")
        builder.setPositiveButton("Yes") { dialogInterface: DialogInterface, i: Int ->
            super.onBackPressed()
        }
        builder.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
            // Do nothing
        }
        builder.show()

    }

}