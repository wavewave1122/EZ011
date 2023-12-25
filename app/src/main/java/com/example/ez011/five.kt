package com.example.ez011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val x1: Button = findViewById(R.id.x1)
        val x2: Button = findViewById(R.id.x2)
        val x3: Button = findViewById(R.id.x3)
        val x4: Button = findViewById(R.id.x4)

        x1.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        x2.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        x3.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        x4.setOnClickListener {
            val intent = Intent(this, six::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}