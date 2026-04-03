package com.example.multiplytable

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val resultTxt = findViewById<TextView>(R.id.resultTxt)
        val button = findViewById<Button>(R.id.button)
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        resultTxt.visibility = View.GONE
        editTextNumber.setText("")




        button.setOnClickListener {
            val input = editTextNumber.text.toString()
            if (input.isNotEmpty()) {
                val number = input.toInt()
                val result = StringBuilder()
                for (i in 1..10) {
                    result.append("$number x $i = ${number * i}\n")
                }
                resultTxt.text = result.toString()
                resultTxt.visibility = View.VISIBLE
            } else {
                editTextNumber.error = "Please enter a number"
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}