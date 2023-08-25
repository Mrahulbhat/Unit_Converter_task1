package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar

class dummy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)
        supportActionBar?.hide()
        Handler().postDelayed(
            {
                val i = Intent(this,intro::class.java)
                startActivity(i)
                finish()
            },500)
    }
}