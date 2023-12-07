package com.tharindu.tutorhub.models

import java.time.LocalDateTime


class Review(
    var author: Student,
    var description: String,
    var rating: Int,
    var timeStamp: LocalDateTime = LocalDateTime.now()
) {
    fun addReview(newAuthor: Student, newDescription: String, newRating: Int) {
        TODO()
    }

    fun deleteReview() {
        TODO()
    }
}