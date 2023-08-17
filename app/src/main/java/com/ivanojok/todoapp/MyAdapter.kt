package com.ivanojok.todoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(val context: Context, val list: ArrayList<ChatModel>): BaseAdapter() {
    //gets number of elements in the list
    override fun getCount(): Int {
        return list.size
    }

    //gets a single element from the list, p0 (position) is the index
    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    //gets the id of the element in the list
    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    //gets ui and loads it on the list view
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null)

        val name = view.findViewById<TextView>(R.id.name)
        val message = view.findViewById<TextView>(R.id.message)
        val date = view.findViewById<TextView>(R.id.date)
        val image = view.findViewById<ImageView>(R.id.image)

        name.text = list[p0].name
        message.text = list[p0].message
        date.text = list[p0].date
        image.setImageResource(list[p0].image)


        return view
    }

}