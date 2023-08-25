package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class kgtog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kgtog)
        supportActionBar?.hide()

        val kg = findViewById<TextInputEditText>(R.id.kg)
        val result = findViewById<TextView>(R.id.result)
        val button = findViewById<Button>(R.id.button)
        val home1=findViewById<Button>(R.id.home1)
        val swap1=findViewById<ImageButton>(R.id.swap1)

        button.setOnClickListener()
        {
            if (kg.text.toString().isEmpty())
                kg.error = "required!!"
            else {
                val toast = Toast.makeText(this, "Calculating", Toast.LENGTH_SHORT)
                toast.show()

                var grams = (kg.text.toString().toInt() * 1000).toString();

                result.text = kg.text.toString() + " kg =" + grams + " grams"

            }

        }

        swap1.setOnClickListener()
        {
            val intent=Intent(this,Gtokg::class.java)
            startActivity(intent)
        }

        home1.setOnClickListener()
        {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}