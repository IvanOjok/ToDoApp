package com.ivanojok.todoapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.ivanojok.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = binding.myList
        val countryList = listOf("Uganda", "Kenya", "Tanzania", "Rwanda", "Burundi",
            "DRC", "UK", "South Sudan", "USA", "Canada")
        val cityList = listOf("Kampala", "Nairobi", "Dar e Salam", "Kigali", "Burundi",
            "DRC", "UK", "South Sudan", "USA", "Canada")

        //array adapter with single item view
        //val arrayAdapter = ArrayAdapter(this, R.layout.list_item_layout, R.id.country_id, countryList)

        //array adapter with multiple views
        val arrayAdapter = NewAdapter(this, countryList, cityList)

        myList.adapter = arrayAdapter



    }
}

class NewAdapter(context:Context, val countryList: List<String>, val cityList: List<String>): ArrayAdapter<String>(context, R.layout.list_item_layout, R.id.country_id, countryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view =  super.getView(position, convertView, parent)

        val countryId = view.findViewById<TextView>(R.id.country_id)
        val cityId = view.findViewById<TextView>(R.id.city)
        countryId.text = countryList[position]
        cityId.text = cityList[position]

        return view
    }
}