package com.ivanojok.todoapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


/** Creating a data access object */
@Dao
interface ActivityDao {

    @Insert
    fun insertActivity(data:ActivityModel)

    @Query("select * from activitymodel")
    fun getAllActivities(): List<ActivityModel>

}