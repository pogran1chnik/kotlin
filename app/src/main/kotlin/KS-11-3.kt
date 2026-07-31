package org.example.app

class Participant(
    val nickname: String,
    val avatar: String,
    var status: String,
)

class Room(
    val cover: String,
    val name: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateStatus(nickname: String, newStatus: String) {
        val found = participants.find { it.nickname == nickname }
        found?.status = newStatus
    }

    fun printInfo() {
        println("=== Комната: $name ===")
        println("Обложка: $cover")
        println("Участники:")
        if (participants.isEmpty()) {
            println("  (пусто)")
        } else {
            participants.forEach {
                println("  ${it.nickname} (${it.avatar}) - ${it.status}")
            }
        }
        println()
    }
}

fun main() {
    val participant1 = Participant(
        nickname = "alice",
        avatar = "avatar_alice.png",
        status = "разговаривает",
    )
    val participant2 = Participant(
        nickname = "bob",
        avatar = "avatar_bob.png",
        status = "микрофон выключен",
    )
    val participant3 = Participant(
        nickname = "charlie",
        avatar = "avatar_charlie.png",
        status = "пользователь заглушен",
    )

    val room = Room(
        cover = "kotlin_room.jpg",
        name = "Голосовой чат по Kotlin",
    )

    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)

    println("=== ИНФОРМАЦИЯ О КОМНАТЕ ===")
    room.printInfo()

    println("=== ОБНОВЛЕНИЕ СТАТУСА ===")
    println("Обновляем статус bob на 'разговаривает'...")
    room.updateStatus("bob", "разговаривает")
    println()

    println("=== ОБНОВЛЕННАЯ ИНФОРМАЦИЯ ===")
    room.printInfo()
}