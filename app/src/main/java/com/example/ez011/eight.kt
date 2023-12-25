package com.example.ez011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val q1: Button = findViewById(R.id.q1)
        val q2: Button = findViewById(R.id.q2)
        val q3: Button = findViewById(R.id.q3)
        val q4: Button = findViewById(R.id.q4)

        q1.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
        q2.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q3.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        q4.setOnClickListener {
            val intent = Intent(this, nine::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
    }
}