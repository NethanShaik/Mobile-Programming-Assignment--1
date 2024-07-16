package com.example.assignment_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkout)

        val payment: Spinner = findViewById(R.id.payment_options)
        val purchase: Button = findViewById(R.id.purchase)
        val options = arrayOf("Debit", "Credit", "Gift Card")
        var flag: String = ""

        payment.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, options).apply {
            setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        }

        payment.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                flag = options[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Nothing")
            }
        }
        purchase.setOnClickListener{
            val purchase = Intent(this, Completion::class.java)
            startActivity(purchase)
        }

    }
}
