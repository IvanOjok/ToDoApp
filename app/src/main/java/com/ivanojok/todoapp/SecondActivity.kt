package com.ivanojok.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.ivanojok.todoapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val districts = arrayOf("Kampala", "Wakiso", "Mukono")
        val arrayAdapter = ArrayAdapter(this, R.layout.second_item_layout, R.id.district_name, districts)

        val myAutoCompleteView = binding.districtList
        myAutoCompleteView.setAdapter(arrayAdapter)

    }
}