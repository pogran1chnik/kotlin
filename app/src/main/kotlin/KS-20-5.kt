package org.example.app

class Robot {
    private val phrases = listOf(
        "Привет, мир!",
        "Я робот.",
        "Сегодня отличный день.",
        "Работаю по расписанию.",
        "Время для чая."
    )

    private var modifier: (String) -> String = { it }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        val phrase = phrases.random()
        val result = modifier(phrase)
        println(result)
    }
}

fun main() {
    val robot = Robot()

    println("=== Обычная речь ===")
    robot.say()
    println()

    println("=== Установка модификатора ===")
    robot.setModifier { it.reversed() }
    println()

    println("=== Речь с модификатором ===")
    robot.say()
}