package com.example.ez011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val t1: Button = findViewById(R.id.t1)
        val t2: Button = findViewById(R.id.t2)
        val t3: Button = findViewById(R.id.t3)
        val t4: Button = findViewById(R.id.t4)

        t1.setOnClickListener {
            val intent = Intent(this, ten::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        t2.setOnClickListener {
            val intent = Intent(this, ten::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        t3.setOnClickListener {
            val intent = Intent(this, ten::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        t4.setOnClickListener {
            val intent = Intent(this, ten::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}