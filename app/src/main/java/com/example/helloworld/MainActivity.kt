package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textNumber: TextView = findViewById(R.id.textNumber)
        val buttonIncrement: Button = findViewById(R.id.buttonIncrement)
        buttonIncrement.setOnClickListener {
            textNumber.text = incrementValue(textNumber.text.toString())
        }
    }

    private fun incrementValue(number: String): String {
        val num = number.toInt() + 1
        return num.toString()
    }
}