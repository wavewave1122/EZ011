package com.example.ez011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ez011.R

class total : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total)

        val total: TextView = findViewById(R.id.total)

        val receivedIntent = intent
        val numrand = receivedIntent.getIntExtra("jumeng", 0)
        total.setText(numrand.toString())

    }
}