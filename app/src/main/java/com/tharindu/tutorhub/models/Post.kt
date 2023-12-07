package com.tharindu.tutorhub.models

import java.util.UUID

abstract class Post(
    var id: String = UUID.randomUUID().toString(),
    var title: String,
    var description: String,
    var subject: String,
    var grade: String,
    var image: String
) {
    // Abstract function to view post details
    abstract fun viewPost()

    // Abstract function to update post details
    abstract fun updatePost(newTitle: String, newDescription: String, newSubject: String, newGrade: String, newImage: String)

    // Abstract function to delete post
    abstract fun deletePost()
}
