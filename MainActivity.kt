package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val produce: ImageButton = findViewById(R.id.produce)
        val meat: ImageButton = findViewById(R.id.meat)

        produce.setOnClickListener{
            val produce = Intent(this, Produce::class.java)
            startActivity(produce)

        }

        meat.setOnClickListener{
            val meat = Intent(this, Meat::class.java)
            startActivity(meat)
        }

    }
}
