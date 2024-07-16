package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Produce : AppCompatActivity() {
    fun total_cost(onion:Int, tomato:Int, potato:Int): Int{
        val total_onion = onion *  7
        val total_tomato = tomato * 5
        val total_potato = potato * 3

        return total_onion + total_tomato + total_potato

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_produce)

        val total_amount: Button = findViewById(R.id.total_amount)
        val onion_count: EditText = findViewById(R.id.onion_weight)
        val tomato_count: EditText = findViewById(R.id.tomato_weight)
        val potato_count: EditText = findViewById(R.id.potato_weight)
        val total: TextView = findViewById(R.id.total)
        val actionBar = supportActionBar

        if (actionBar != null) {
            actionBar.title = "Produce Department!"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        total_amount.setOnClickListener{
            val onion: Int = onion_count.text.toString().toIntOrNull() ?: 0
            val tomato: Int = tomato_count.text.toString().toIntOrNull() ?:0
            val potato: Int = potato_count.text.toString().toIntOrNull() ?:0
            val total_amount = total_cost(onion, tomato, potato)
            total.text = "Your total is $$total_amount"

        }

        val checkout: Button = findViewById(R.id.Checkout)
        checkout.setOnClickListener{
            val checkout = Intent(this, Checkout::class.java)
            startActivity(checkout)
        }

    }
}
