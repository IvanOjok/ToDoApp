package com.ivanojok.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ivanojok.todoapp.data.ActivityAdapter
import com.ivanojok.todoapp.data.ActivityModel
import com.ivanojok.todoapp.data.ActivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Completed))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Failed))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.attach, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))

        val activityAdapter = ActivityAdapter(this, list)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = activityAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)


        //Add floating action button (or image) that intents (moves) to another activity.
        //In that activity,
    // capture image from the camera (2, 4, 6, 8, 10) or capture image from file storage (1, 3, 5, 7, 9, 11)
        //allow input of text for activity name,
        //allow input of text for activity description
        //allow input of date and time using a dialog
    }
}