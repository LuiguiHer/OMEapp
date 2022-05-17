package com.example.ome

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ome.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btndetails.setOnClickListener {

            replaceFragment(FragmentDetails())
        }


        val button3 = findViewById<Button>(R.id.btn_newLogin)
        button3.setOnClickListener {
            val start = Intent(this, MainActivity::class.java)
            startActivity(start)

        }
    }

    private fun replaceFragment( fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_welcome, fragment)
        fragmentTransaction.commit()
    }
}