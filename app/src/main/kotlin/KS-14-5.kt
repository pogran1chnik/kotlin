package org.example.app

open class Message(
    val id: Int,
    val author: String,
    val text: String,
    val parentMessageId: Int? = null,
)
class ChildMessage(
    id: Int,
    author: String,
    text: String,
    parentMessageId: Int
) : Message(id, author, text, parentMessageId)

class Chat {

    private val messages = mutableListOf<Message>()
    private var nextId = 1


    fun addMessage(author: String, text: String){
        messages.add(Message(nextId, author, text))
        nextId++

    }
    fun addThreadMessage(parentMessageId: Int, author: String, text: String){
        val parentExists = messages.any{ it.id == parentMessageId}
        if (parentExists){
            val childMessage = ChildMessage(nextId, author, text, parentMessageId)
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

        // Группируем сообщения по parentMessageId
        val grouped = messages.groupBy { it.parentMessageId }

        // Сначала печатаем обычные сообщения (parentMessageId == null)
        grouped[null]?.forEach { message ->
            println("${message.author}: ${message.text}")

            // Печатаем дочерние сообщения для этого родителя
            grouped[message.id]?.forEach { child ->
                println("\t${child.author}: ${child.text}")
            }
        }
    }
}

fun main() {
    val chat = Chat()


    chat.addMessage("Alice", "Привет всем!")
    chat.addMessage("Bob", "Всем привет!")
    chat.addMessage("Alice", "Как дела?")


    chat.addThreadMessage(3, "Charlie", "У меня отлично!")
    chat.addThreadMessage(3, "Bob", "Тоже хорошо!")


    chat.addMessage("Alice", "Что нового?")


    chat.addThreadMessage(5, "Bob", "Есть новости!")


    chat.addThreadMessage(99, "Test", "Это не будет добавлено")

    println("=== Чат ===")
    chat.printChat()
}



