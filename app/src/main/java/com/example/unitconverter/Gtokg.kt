package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import javax.crypto.KeyGenerator

class Gtokg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gtokg)
        supportActionBar?.hide()

        val g=findViewById<TextInputEditText>(R.id.grams)
        val result = findViewById<TextView>(R.id.result)
        val button = findViewById<Button>(R.id.button)
        val swap1=findViewById<ImageButton>(R.id.swap1)
        val home1=findViewById<Button>(R.id.home1)

        home1.setOnClickListener()
        {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        swap1.setOnClickListener()
        {
            val intent= Intent(this,kgtog::class.java)
            startActivity(intent)
        }

        button.setOnClickListener()
        {
            if (g.text.toString().isEmpty())
                g.error = "required!!"
            else {
                val toast = Toast.makeText(this, "Calculating", Toast.LENGTH_SHORT)
                toast.show()

                var kilograms = (g.text.toString().toDouble() / 1000).toString().toDouble().toString();

                result.text = g.text.toString() + " g =" + kilograms + "Kg"

            }

        }
    }
}