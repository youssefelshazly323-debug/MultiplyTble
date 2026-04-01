package com.example.multiplytable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // created variables for the button and the input

        val button = findViewById<Button>(R.id.button)
        val numInout = findViewById<EditText>(R.id.editTextNumber)
        // created a listener for the button
        button.setOnClickListener {
         // created an intent to go to the next activity

            val intent = Intent(this, DIisply::class.java)
            // transfer the number to the next activity
            intent.putExtra("number", numInout.text.toString())

            startActivity(intent)
        }
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}