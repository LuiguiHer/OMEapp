package com.example.ome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        val button3 = findViewById<Button>(R.id.btn_newLogin)
        button3.setOnClickListener {
            val start = Intent(this, MainActivity::class.java)
            startActivity(start)
        }
    }
}