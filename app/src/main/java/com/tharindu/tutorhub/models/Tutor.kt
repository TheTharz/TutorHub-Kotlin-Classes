package com.tharindu.tutorhub.models

class Tutor(
    id: String,
    email: String,
    password: String,
    username: String,
    picture: String,
    city: String,
    var qualifications: Qualification,
    var tutorName: String,
    var experience: Int,
    var hourlyPrice: Double,
    var gender: String,
    var socialLinks: SocialLinks,
    var reviews: List<Review>,
    var posts: List<TutorPost>,
    var subjectsTaught: List<String>
) : User(id, email, password, username, picture, city) {

    override fun createUser() {
        println("Tutor created successfully")
    }

    override fun updateUser() {
        println("Tutor information updated successfully")
    }

    override fun viewUser() {
    }

    fun createTutorProfile() {
        println("Tutor profile created successfully")
    }

    fun filterTutor(subject: String, gender: String): List<Tutor> {
        TODO()
    }

    fun searchTutor(keyword: String): List<Tutor> {
        TODO()
    }
}
