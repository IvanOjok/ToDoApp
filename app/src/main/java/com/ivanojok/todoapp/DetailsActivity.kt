package com.ivanojok.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val image = intent.getIntExtra("image", R.drawable.attach)
        val name = intent.getStringExtra("activityName")

        val icon = findViewById<ImageView>(R.id.activity_icon)
        icon.setImageResource(image)
    }
}