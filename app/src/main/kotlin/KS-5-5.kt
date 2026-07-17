package org.example.app

import kotlin.random.Random

fun main() {
    // Генерируем 3 случайных выигрышных числа от 0 до 42
    val winningNumbers = listOf(
        Random.nextInt(0, 43),
        Random.nextInt(0, 43),
        Random.nextInt(0, 43)
    )

    // Список для чисел пользователя
    val userNumbers = mutableListOf<Int>()

    // Запрашиваем 3 числа у пользователя
    repeat(3) { index ->
        println("Введите число ${index + 1} (от 0 до 42):")
        userNumbers.add(readln().toInt())
    }

    // Находим совпадения с помощью intersect()
    val matches = winningNumbers.intersect(userNumbers)
    val matchCount = matches.size

    // Выводим результат в зависимости от количества совпадений
    when (matchCount) {
        3 -> println("Поздравляем! Вы угадали все три числа и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Поздравляем! Вы угадали одно число и получаете утешительный приз!")
        0 -> println("К сожалению, вы не угадали ни одного числа.")
    }

    // Выводим выигрышные числа
    println("Выигрышные числа: $winningNumbers")
}