package com.ivanojok.todoapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi
import com.ivanojok.todoapp.data.ActivityStatus

class DetailsActivity : AppCompatActivity() {
    //@RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val image = intent.getIntExtra("image", R.drawable.attach)
        val name = intent.getStringExtra("activityName")
        //val status = intent.getParcelableExtra("activityStatus", ActivityStatus::class.java)
        val status = intent.getSerializableExtra("activityStatus")
        Log.d("Status", "$status")

        val icon = findViewById<ImageView>(R.id.activity_icon)
        icon.setImageResource(image)

        val button = findViewById<Button>(R.id.button)
        button.text = status.toString()


//        when(status) {
//            is ActivityStatus
//        }
    }
}