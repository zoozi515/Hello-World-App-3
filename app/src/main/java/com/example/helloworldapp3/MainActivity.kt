package com.example.helloworldapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var number1 : EditText
    lateinit var number2 : EditText
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number1 = findViewById(R.id.number1_editText)
        number2 = findViewById(R.id.number2_editText)

        result = findViewById(R.id.result_textView)
        number1.setText("10")
        number2.setText("40")

        calculation()
    }

    fun calculation(){
        var sum = number1.getText().toString()!!.toInt() + number2.getText().toString()!!.toInt()
        result.text = "$sum"
    }
}