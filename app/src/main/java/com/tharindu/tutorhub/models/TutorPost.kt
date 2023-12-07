package com.tharindu.tutorhub.models

class TutorPost(
    id: String,
    title: String,
    description: String,
    subject: String,
    grade: String,
    image: String,
    var tutor: Tutor
) : Post(id,title, description, subject, grade, image) {
    override fun viewPost() {
        TODO()
    }

    override fun updatePost(newTitle: String, newDescription: String, newSubject: String, newGrade: String, newImage: String) {
        TODO()
    }

    override fun deletePost() {
        TODO()
    }
}
