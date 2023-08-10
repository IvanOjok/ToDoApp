package com.ivanojok.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.ivanojok.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myList = binding.myList
        val countryList = listOf("Uganda", "Kenya", "Tanzania", "Rwanda", "Burundi",
            "DRC", "UK", "South Sudan", "USA", "Canada")
        val arrayAdapter = ArrayAdapter(this, R.layout.list_item_layout, R.id.country_id, countryList)

        myList.adapter = arrayAdapter


        

    }
}