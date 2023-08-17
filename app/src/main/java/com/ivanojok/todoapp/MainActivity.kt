package com.ivanojok.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivanojok.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val list = List<ChatModel>(10, {ChatModel()})
        val list = ArrayList<ChatModel>()
        list.add(ChatModel(R.drawable.attach, "Ivan Ojok", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_foreground, "Ivan Peter", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.attach, "Ivan Dan", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_background, "Ivan Micheal", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.attach, "Ivan Ojok", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.attach, "Mugisha Ojok", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_foreground, "Nathan Ojok", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.attach, "Jamal Ojok", "Hello, How are You?", "Yesterday"))
        list.add(ChatModel(R.drawable.attach, "Allan Ojok", "Hello, How are You?", "Yesterday"))

        val myAdapter = MyAdapter(this, list)

        val listView = binding.myList
        listView.adapter = myAdapter
        //binding.myList.adapter = myAdapter

        //Create a gridview using any layout of Your own having two columns

    }
}