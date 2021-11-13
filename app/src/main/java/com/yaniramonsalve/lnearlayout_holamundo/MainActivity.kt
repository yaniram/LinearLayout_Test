package com.yaniramonsalve.lnearlayout_holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val sendButton = findViewById<Button>(R.id.send)

        sendButton.setOnClickListener {
            Log.d("MainActivity", "Button Clicked")
            val message = email.text
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        }
    }
}