package com.tharindu.tutorhub.models

class Student(
    id: String,
    email: String,
    password: String,
    username: String,
    picture: String,
    city: String,
    var preferences: Array<String>,
    var studentPosts: List<StudentPost>
) : User(id, email, password, username, picture, city) {

    // Function to view student's own posts
    fun viewMyPosts() {
        TODO()
    }

    override fun createUser() {
        TODO("Not yet implemented")
    }

    override fun updateUser() {
        TODO("Not yet implemented")
    }

    override fun viewUser() {
        TODO("Not yet implemented")
    }
}
