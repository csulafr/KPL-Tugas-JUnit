package com.example.simplecalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var resultText: TextView
    lateinit var buttonAdd: Button
    lateinit var buttonSubtract: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        resultText = findViewById(R.id.resultText)
        buttonAdd = findViewById(R.id.buttonAdd)
        buttonSubtract = findViewById(R.id.buttonSubtract)

        buttonAdd.setOnClickListener {
            val result = calculate('+')
            resultText.text = "Hasil : $result"
        }

        buttonSubtract.setOnClickListener {
            val result = calculate('-')
            resultText.text = "Hasil : $result"
        }
    }

    fun calculate(op: Char): Int {
        val num1 = input1.text.toString().toIntOrNull() ?: 0
        val num2 = input2.text.toString().toIntOrNull() ?: 0
        return if (op == '+') num1 + num2 else num1 - num2
    }
}
