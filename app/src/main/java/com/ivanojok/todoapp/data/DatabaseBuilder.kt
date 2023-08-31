package com.ivanojok.todoapp.data

import android.content.Context
import androidx.room.Room

/** To build the database */
class DatabaseBuilder() {

    fun buildDB(context: Context): ActivityDatabase {
        return Room.databaseBuilder(
            context,
            ActivityDatabase::class.java,
            "room_db_name"
        ).build()
    }
}