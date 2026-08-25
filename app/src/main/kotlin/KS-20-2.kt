package org.example.app

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
){
    fun printInfo(){
        println("Имя: $name")
        println("Здоровье: ${maxHealth/currentHealth}")
    }
}

var healPlayer: (Player) -> Unit = { player -> player.currentHealth = player.maxHealth
    println("${player.name} выпил лечебное зелье!")
    println("Здоровье полностью восстановлено!")
    println()
}

fun main() {

    val player = Player("Magic", 30, 100)

    println("=== До лечения ===")
    player.printInfo()

    println("=== Применение зелья ===")
    healPlayer(player)

    println("=== После лечения ===")
    player.printInfo()

}


