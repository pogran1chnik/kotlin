package org.example.app


import kotlin.random.Random

fun main() {

    val secretNumber = Random.nextInt(1, 10)
    var attempts = 5
    var currentAttempt = 1  // Счетчик текущей попытки

    println("Загадано число от 1 до 9. У вас 5 попыток.")
    while (attempts > 0) {
        println("Попытка $currentAttempt. Введите число:")
        val userNumber = readln().toInt()
        if (userNumber == secretNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            attempts--
            currentAttempt++  // Увеличиваем счетчик попыток
            println("Неверно! Осталось попыток: $attempts")
        }
    }
    if (attempts == 0) {
        println("Было загадано число $secretNumber")
    }
}