package com.example.ome

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentDetails : Fragment(R.layout.fragment_details){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }



    @SuppressLint("SetTextI18n")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val preferences: SharedPreferences =
            this.requireContext()
                .getSharedPreferences("REGISTER_DATA", Context.MODE_PRIVATE)

        val name = preferences.getString("NAME", "name not Found")
        val txtName = requireView().findViewById<TextView>(R.id.txt_name)
        txtName.text  =name

        val lastName = preferences.getString("LAST_NAME", "not Found")
        val txtLname = requireView().findViewById<TextView>(R.id.txt_lastName)
        txtLname.text  =lastName

        val email = preferences.getString("EMAIL", "not Found")
        val txtEmail = requireView().findViewById<TextView>(R.id.txt_email)
        txtEmail.text  =email

        val year = preferences.getString("YEAR", "not Found")
        val txtYear = requireView().findViewById<TextView>(R.id.txt_year)
        txtYear.text  =year

        val month = preferences.getString("MONTH", "not Found")
        val txtMonth = requireView().findViewById<TextView>(R.id.txt_month)
        txtMonth.text  =month

        val day = preferences.getString("DAY", "not Found")
        val txtDay = requireView().findViewById<TextView>(R.id.txt_day)
        txtDay.text  =day

        val street = preferences.getString("STREET", "not Found")
        val txtStreet = requireView().findViewById<TextView>(R.id.txt_street)
        txtStreet.text  =street

        val city = preferences.getString("CITY", "not Found")
        val txtCity = requireView().findViewById<TextView>(R.id.txt_city)
        txtCity.text  =city

        val state = preferences.getString("STATE", "not Found")
        val txtState = requireView().findViewById<TextView>(R.id.txt_state)
        txtState.text  = state

        val terms = preferences.getString("TERMS", "not Found")
        if (terms == "true"){
            val txtTerms = requireView().findViewById<TextView>(R.id.txt_agreeTerms)
            txtTerms.text  ="Yes"
        }else{
            val txtTerms = requireView().findViewById<TextView>(R.id.txt_agreeTerms)
            txtTerms.text  ="Not"
        }














    }
}

