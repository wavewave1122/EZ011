package com.example.ez011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("jumeng", 0)

        val z1: Button = findViewById(R.id.z1)
        val z2: Button = findViewById(R.id.z2)
        val z3: Button = findViewById(R.id.z3)
        val z4: Button = findViewById(R.id.z4)

        z1.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        z2.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        z3.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", numrand)
            startActivity(intent)
        }
        z4.setOnClickListener {
            val intent = Intent(this, eight::class.java)
            intent.putExtra("jumeng", numrand + 1)
            startActivity(intent)
        }
    }
}