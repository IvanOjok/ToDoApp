package com.ivanojok.todoapp.data

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

/** creating the entity (table) */
@Entity
data class ActivityModel(
    @PrimaryKey(autoGenerate = true) val id:Int?,
    val image: String?,
    var activityName:String = "",
    var activityTime: String = "",
    var activityDescription:String = "",
    var activityStatus: ActivityStatus = ActivityStatus.Pending
)


