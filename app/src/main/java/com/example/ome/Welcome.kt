package com.example.ome

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ome.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    lateinit var binding: ActivityWelcomeBinding
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btndetails.setOnClickListener {
            replaceFragment(FragmentDetails())
        }

        preferences = getSharedPreferences("REGISTER_DATA", Context.MODE_PRIVATE)

        val button3 = findViewById<Button>(R.id.btn_newLogin)
        button3.setOnClickListener {
            val start = Intent(this, MainActivity::class.java)
            startActivity(start)
            val editor: SharedPreferences.Editor = preferences.edit()
            editor.clear()

        }
    }








    private fun replaceFragment( fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_welcome, fragment)
        fragmentTransaction.commit()
    }
}