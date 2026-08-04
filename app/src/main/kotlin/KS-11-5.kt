package org.example.app

class ForumUser private constructor(
    val userId: Int,
    val userName: String
) {
    class Builder {
        private var userId: Int = 0
        private var userName: String = ""

        fun setUserId(userId: Int): Builder {
            this.userId = userId
            return this
        }

        fun setUserName(userName: String): Builder {
            this.userName = userName
            return this
        }

        fun build(): ForumUser {
            return ForumUser(userId, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String
) {
    class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(authorId: Int): Builder {
            this.authorId = authorId
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

class Forum {
    private val users = mutableListOf<ForumUser>()
    private val messages = mutableListOf<ForumMessage>()
    private var nextUserId = 1

    fun createNewUser(userName: String): ForumUser {
        val user = ForumUser.Builder()
            .setUserId(nextUserId)
            .setUserName(userName)
            .build()
        users.add(user)
        nextUserId++
        return user
    }

    fun createNewMessage(userId: Int, message: String): ForumMessage? {
        val user = users.find { it.userId == userId }
        return if (user != null) {
            val forumMessage = ForumMessage.Builder()
                .setAuthorId(userId)
                .setMessage(message)
                .build()
            messages.add(forumMessage)
            forumMessage
        } else {
            println("Ошибка: Пользователь с ID $userId не найден")
            null
        }
    }

    fun printThread() {
        if (messages.isEmpty()) {
            println("Нет сообщений на форуме")
            return
        }

        messages.forEach { message ->
            val author = users.find { it.userId == message.authorId }
            val authorName = author?.userName ?: "Неизвестный автор"
            println("$authorName: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    // Создаем двух пользователей
    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    println("Созданы пользователи:")
    println("${user1.userName} (ID: ${user1.userId})")
    println("${user2.userName} (ID: ${user2.userId})")
    println()

    // Создаем сообщения от первого пользователя
    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user1.userId, "Как дела?")

    // Создаем сообщения от второго пользователя
    forum.createNewMessage(user2.userId, "Привет, Алиса!")
    forum.createNewMessage(user2.userId, "У меня все отлично!")

    // Пробуем создать сообщение от несуществующего пользователя
    forum.createNewMessage(999, "Это сообщение не будет создано")

    println("\n=== Все сообщения форума ===")
    forum.printThread()
}