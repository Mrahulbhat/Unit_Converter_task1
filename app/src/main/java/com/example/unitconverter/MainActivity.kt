package com.example.unitconverter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        var weight=findViewById<ImageButton>(R.id.imageButton1)
        val lp=findViewById<Button>(R.id.lp)
        var distance=findViewById<ImageButton>(R.id.imageButton2)

        distance.setOnClickListener()
        {
            val intent = Intent(this, km_to_m::class.java)
            startActivity(intent)

        }
        weight.setOnClickListener()
        {
            val intent=Intent(this,kgtog::class.java)
            startActivity(intent)
        }

        val feedback=findViewById<Button>(R.id.button4)
        feedback.setOnClickListener()
        {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=(Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScKVWvzsO3CUfxz7-3fmNBpHtTfP8Gfk1iZO2qrTCyqDWmlgg/viewform?usp=sharing"))
            startActivity(intent)
        }

        lp.setOnClickListener()
        {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data=(Uri.parse("https://www.linkedin.com/in/m-rahul-bhat/"))
            startActivity(intent)
        }
    }
}