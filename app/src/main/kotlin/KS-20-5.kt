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
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}