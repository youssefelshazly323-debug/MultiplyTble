package com.example.multiplytable

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DIisply : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diisply)

        //assigning the number from the intent to a variable
        val bundle: Bundle? = intent.extras
        //getting the number from the intent
        val tablestring: String? = bundle?.getString("tablenumber")
        //converting the string back to an integer
        val tableNumber = tablestring!!.toInt()

        //display the heading so we can see the value in the action
        val multiplytable = findViewById<TextView>(R.id.textView)
        multiplytable.text = "$tableNumber × table"
        //start with the heading and add two new lines
        var tableDisplay = "$tableNumber × table\n\n"
        //lopp 10 numbers and add them to the string

        //set the string onto the display

        //declare the control variable
        var counter = 2
        while (counter <= 10) {
            if (counter == 6) {
                continue
            }

            val answer = tableNumber * counter
            tableDisplay += "$tableNumber × $counter = $answer\n"

            counter++
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}