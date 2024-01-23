package com.example.appsumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valor1: EditText = findViewById(R.id.valor1)
        val valor2: EditText = findViewById(R.id.valor2)
        val miBotonSuma: Button = findViewById(R.id.button)
        val resultado: TextView = findViewById(R.id.resultado)
        val miBotonResta: Button = findViewById(R.id.button2)

        miBotonSuma.setOnClickListener {

            val num1 = valor1.text.toString().toInt()
            val num2 = valor2.text.toString().toInt()
            val suma = num1 + num2
            resultado.text = suma.toString()

        }

        miBotonResta.setOnClickListener {

            val num1 = valor1.text.toString().toInt()
            val num2 = valor2.text.toString().toInt()
            val resta = num1 - num2
            resultado.text = resta.toString()

        }


    }
}