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

class Meat : AppCompatActivity() {
    fun total_cost(chicken:Int, beef:Int, lamb:Int): Int{
        val total_chicken = chicken *  15
        val total_beef = beef * 10
        val total_lamb = lamb * 20

        return total_chicken + total_beef + total_lamb

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_meat)

        val total: Button = findViewById(R.id.total_amount)
        val chicken_count: EditText = findViewById(R.id.chicken_count)
        val beef_count: EditText = findViewById(R.id.beef_count)
        val lamb_count: EditText = findViewById(R.id.lamb_count)
        val total_amt: TextView = findViewById(R.id.total)
        val actionBar = supportActionBar

        if (actionBar != null) {
            actionBar.title = "Meat Department!"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        total.setOnClickListener{
            val chicken: Int = chicken_count.text.toString().toIntOrNull() ?: 0
            val beef: Int = beef_count.text.toString().toIntOrNull() ?:0
            val lamb: Int = lamb_count.text.toString().toIntOrNull() ?:0
            val total_amount = total_cost(chicken, beef, lamb)
            total_amt.text = "Your total is $$total_amount"

        }

        val checkout: Button = findViewById(R.id.Checkout)
        checkout.setOnClickListener{
            val checkout = Intent(this, Checkout::class.java)
            startActivity(checkout)
        }

    }
}
