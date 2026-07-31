package org.example.app

class Participant(
    val nickname: String,
    var status: String,

)

class Room(
    var cover: String,
    var name: String,
    var participants: MutableList<Participant> = mutableListOf()
){
    fun addParticipant(participant: Participant){
        participants += participant

    }
    fun updateStatus(nickname: String, newStatus: String){
        val found = participants.find {it.nickname == nickname}
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
                println("  ${it.nickname} - ${it.status}")
            }
        }
        println()
    }
}
fun main() {

    val participant1 = Participant("alice", "разговаривает")
    val participant2 = Participant("bob", "микрофон выключен")
    val participant3 = Participant("charlie", "пользователь заглушен")


    val room = Room(
        cover = "kotlin_room.jpg",
        name = "Голосовой чат по Kotlin"
    )


    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)


    println("ИНФОРМАЦИЯ О КОМНАТА")
    room.printInfo()


    println("ОБНОВЛЕНИЕ СТАТУСА")
    println("Обновляем статус bob на 'разговаривает'...")
    room.updateStatus("bob", "разговаривает")
    println()


    println("ОБНОВЛЕННАЯ ИНФОРМАЦИЯ")
    room.printInfo()
}


