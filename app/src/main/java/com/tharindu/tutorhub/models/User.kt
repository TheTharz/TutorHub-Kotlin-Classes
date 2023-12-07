package com.tharindu.tutorhub.models

import java.util.UUID

abstract class User(
    var id:String = UUID.randomUUID().toString(),
    var email: String,
    var password: String,
    var username: String,
    var picture: String,
    var city: String,
    var chats: MutableList<Chat> = mutableListOf(),
) {
    abstract fun createUser()
    abstract fun updateUser()
    abstract fun viewUser()
}
