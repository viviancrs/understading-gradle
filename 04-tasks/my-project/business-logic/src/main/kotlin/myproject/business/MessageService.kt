package myproject.business

import myproject.data.MessageModel

class MessageService {
    companion object {
        fun printMessage() {
            println(MessageModel().getMessage())
        }
    }
}