package com.example.multiplytable

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DIisply : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diisply)

        //assigning the number from the intent to a variable
        val bundle: Bundle? = intent.extras
        //getting the number from the intent
        val tablestring: String? = bundle?.getString("tablenumber")
        //converting the string back to an integer
        val tableNumber = tablestring?.toInt()
        val multiplytable = findViewById<TextView>(R.id.textView)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}