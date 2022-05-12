package com.example.ome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val register = findViewById<Button>(R.id.btn_register)
        register.setOnClickListener {
            val start = Intent(this, Welcome::class.java)
            startActivity(start)
        }

        val back = findViewById<Button>(R.id.btn_back)
        back.setOnClickListener {
            val start = Intent(this, MainActivity::class.java)
            startActivity(start)
        }

        val spinnerY = findViewById<Spinner>(R.id.spinner_years)
        val listY = resources.getStringArray(R.array.years)
        val adapterY = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            listY
        )
        spinnerY.adapter = adapterY


        val spinnerM = findViewById<Spinner>(R.id.spinner_month)
        val listM = resources.getStringArray(R.array.month)
        val adapterM = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            listM
        )
        spinnerM.adapter = adapterM

        val spinnerS = findViewById<Spinner>(R.id.spn_state)
        val listS = resources.getStringArray(R.array.state)
        val adapterS = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            listS
        )
        spinnerS.adapter= adapterS

    }
}