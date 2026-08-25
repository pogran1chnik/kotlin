package org.example.app

class Player(
    var hasKey: Boolean
){
    fun printInfo(){
        println("Ключ есть? $hasKey")
    }
}
val checkDoor: (Player) -> String = { player ->
    if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"

}

fun main() {

    val player1 = Player(false)
    player1.printInfo()
    println(checkDoor(player1))
    val player2 = Player(true)
    player2.printInfo()
    println(checkDoor(player2))

}


