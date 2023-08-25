package com.example.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class km_to_m : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_km_to_m)
        supportActionBar?.hide()

        val km1=findViewById<TextInputEditText>(R.id.km)
        val result=findViewById<TextView>(R.id.result)
        val button=findViewById<Button>(R.id.button)
        val swap1=findViewById<ImageButton>(R.id.swap1)
        val home1=findViewById<Button>(R.id.home1)

        swap1.setOnClickListener()
        {
            val intent=Intent(this,mtokm::class.java)
            startActivity(intent)
        }

        home1.setOnClickListener()
        {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener()
        {
            if(km1.text.toString().isEmpty())
                km1.error="required!!"
            else
            {
                val toast = Toast.makeText(this, "Calculating", Toast.LENGTH_SHORT)
                toast.show()

                var metre=(km1.text.toString().toDouble()*1000).toString();

                result.text=km1.text.toString()+" km ="+metre+" metres"

            }
        }



    }
}