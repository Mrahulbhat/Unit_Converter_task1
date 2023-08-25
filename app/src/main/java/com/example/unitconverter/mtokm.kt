package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class mtokm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mtokm)
        supportActionBar?.hide()

        val m=findViewById<TextInputEditText>(R.id.m)
        val result=findViewById<TextView>(R.id.result)
        val button=findViewById<Button>(R.id.button)
        val swap1=findViewById<ImageButton>(R.id.swap1)
        val home1=findViewById<Button>(R.id.home1)

        swap1.setOnClickListener()
        {
            val intent=Intent(this,km_to_m::class.java)
            startActivity(intent)
        }

        home1.setOnClickListener()
        {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener()
        {
            if(m.text.toString().isEmpty())
                m.error="required!!"
            else
            {
                val toast = Toast.makeText(this, "Calculating", Toast.LENGTH_SHORT)
                toast.show()

                var metre=(m.text.toString().toDouble()*1000).toString().toDouble().toString();

                result.text=m.text.toString()+" m ="+metre+" Km"

            }
        }
    }
}