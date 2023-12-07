package com.tharindu.tutorhub.models

import java.time.LocalDateTime

class Message(
    var sender: User,
    var receiver: User,
    var timestamp: LocalDateTime = LocalDateTime.now(),
    var text: String
) {
    // Function to send a message
    fun send() {
        TODO()
    }
}
