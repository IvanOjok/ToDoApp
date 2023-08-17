package com.ivanojok.todoapp

//class ChatModel {
//    var image:String = ""
//    var name:String = ""
//    var message:String = ""
//    var date:String = ""
//
//    constructor(image:String, name:String, message:String, date:String) {
//        this.image = image
//        this.name = name
//        this.message = message
//        this.date = date
//    }
//}

data class ChatModel(
    var image:Int = 1,
    var name:String = "",
    var message:String = "",
    var date:String = ""
)