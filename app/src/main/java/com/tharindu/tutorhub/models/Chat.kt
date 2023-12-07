package com.tharindu.tutorhub.models

class Chat(

    var sender: User,
    var receiver: User,
    var messages: MutableList<Message> = mutableListOf()
) {
    // Function to delete the chat
    fun deleteChat() {
        TODO()
    }
}
