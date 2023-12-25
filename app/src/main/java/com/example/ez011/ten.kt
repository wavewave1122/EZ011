package com.example.ez011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ez011.total

class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val v1: Button = findViewById(R.id.v1)
        val v2: Button = findViewById(R.id.v2)
        val v3: Button = findViewById(R.id.v3)
        val v4: Button = findViewById(R.id.v4)

        v1.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        v2.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        v3.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        v4.setOnClickListener {
            val intent = Intent(this, total::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}