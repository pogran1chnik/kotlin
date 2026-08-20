package org.example.app

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
    private var isDead: Boolean = false,
) {
    fun getHealth(): Int {
        return health
    }

    fun getAttackPower(): Int {
        return attackPower
    }

    fun isAlive(): Boolean {
        return !isDead
    }

    private fun die() {
        isDead = true
        health = 0
        attackPower = 0
        println("Игрок погиб!")

    }

    fun takeDamage(damage: Int) {
        if (isDead) {
            return
        }
        health -= damage
        println("Получен урон: $damage. Здоровье: $health")
        if (health <= 0) {
            return die()
        }
    }

    fun heal(amount: Int) {
        if (isDead) {
            println("Лечение невозможно")
        } else {
            health += amount
            println("Лечениие +$amount. Здоровье: $health")
        }
    }

    fun attack(): Int {
        if (isDead) {
            return 0
        }
        return attackPower
    }

    fun printInfo() {
        println("Имя: $name, Здоровье: $health, Сила: $attackPower, Статус: $isDead")
    }
}


fun main() {
    val player = Player("dima", 100, 20)
    player.printInfo()
    println("Бой начинается!")

    player.takeDamage(30)
    player.heal(10)
    player.takeDamage(50)
    player.takeDamage(40)


    player.heal(50)


    val damage = player.attack()
    println("Сила удара: $damage")

    println("\nИтог")
    player.printInfo()
}