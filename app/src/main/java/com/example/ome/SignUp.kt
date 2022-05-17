package com.example.ome

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat


class SignUp : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        sharedPreferences = getSharedPreferences("REGISTER_DATA", Context.MODE_PRIVATE)


        val register = findViewById<Button>(R.id.btn_register)
        register.setOnClickListener {

            val name = findViewById<EditText>(R.id.text_name).text.toString()
            val lastName = findViewById<EditText>(R.id.text_lastName).text.toString()
            val email = findViewById<AutoCompleteTextView>(R.id.autoEmail_address).text.toString()
            val year = findViewById<Spinner>(R.id.spinner_years).selectedItem.toString()
            val month = findViewById<Spinner>(R.id.spinner_month).selectedItem.toString()
            val day = findViewById<EditText>(R.id.txt_day).text.toString()
            val street = findViewById<EditText>(R.id.streetAddress).text.toString()
            val city = findViewById<EditText>(R.id.city).text.toString()
            val state = findViewById<Spinner>(R.id.spn_state).selectedItem.toString()
            val terms = findViewById<SwitchCompat>(R.id.agreeT).isChecked.toString()

            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("NAME", name)
            editor.putString("LAST_NAME", lastName)
            editor.putString("EMAIL", email)
            editor.putString("YEAR", year)
            editor.putString("MONTH", month)
            editor.putString("DAY", day)
            editor.putString("STREET", street)
            editor.putString("CITY", city)
            editor.putString("STATE", state)
            editor.putString("TERMS", terms)
            editor.apply()

            Toast.makeText(this, "Successful Registration", Toast.LENGTH_SHORT).show()
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