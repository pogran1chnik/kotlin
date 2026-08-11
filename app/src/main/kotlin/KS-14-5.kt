package org.example.app

open class Message(
    val id: Int,
    val text: String,
    val author: String,
    val parentMessageId: Int? = null
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    parentMessageId: Int
) : Message(id, text, author, parentMessageId)

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        val message = Message(nextId, text, author)
        messages.add(message)
        nextId++
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val parentExists = messages.any { it.id == parentMessageId }
        if (parentExists) {
            val childMessage = ChildMessage(nextId, text, author, parentMessageId)
            messages.add(childMessage)
            nextId++
        } else {
            println("Ошибка: Сообщение с ID $parentMessageId не найдено")
        }
    }

    fun printChat() {
        if (messages.isEmpty()) {
            println("Чат пуст")
            return
        }

        val grouped = messages.groupBy { it.parentMessageId }

        grouped[null]?.forEach { message ->
            println("[${message.id}] ${message.author}: ${message.text}")

            grouped[message.id]?.forEach { child ->
                println("\t[${child.id}] ${child.author}: ${child.text}")
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Привет всем!", "Alice")
    chat.addMessage("Всем привет!", "Bob")
    chat.addMessage("Как дела?", "Alice")

    chat.addThreadMessage("У меня отлично!", "Charlie", 3)
    chat.addThreadMessage("Тоже хорошо!", "Bob", 3)

    chat.addMessage("Что нового?", "Alice")

    chat.addThreadMessage("Есть новости!", "Bob", 6)

    chat.addThreadMessage("Это не будет добавлено", "Test", 99)

    println("=== Чат ===")
    chat.printChat()
}