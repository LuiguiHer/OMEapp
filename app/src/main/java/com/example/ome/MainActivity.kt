package com.example.ome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 = findViewById<Button>(R.id.btn_sign)
        button1.setOnClickListener{
            val start = Intent(this, SignUp::class.java)
            startActivity(start)
        }

    }
}