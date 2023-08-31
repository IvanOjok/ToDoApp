package com.ivanojok.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ActivityModel::class], version = 1)
abstract class ActivityDatabase: RoomDatabase() {
    abstract fun activityDao(): ActivityDao
}