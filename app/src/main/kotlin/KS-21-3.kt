package org.example.app

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean{
    return currentHealth == maxHealth
}
fun main() {

    val maxPlayerHealth = Player("dima", 100, 100)
    val minPlayerHealth = Player("rita", 30, 100)
    println("Игрок 1")
    println("Здоровье: ${maxPlayerHealth.currentHealth}/${maxPlayerHealth.maxHealth}")
    println("доров ли игрок? ${maxPlayerHealth.isHealthy()}")
    println("Игрок 2")
    println("Здоровье: ${minPlayerHealth.currentHealth}/${minPlayerHealth.maxHealth}")
    println("Здоров ли игрок? ${minPlayerHealth.isHealthy()}")
}