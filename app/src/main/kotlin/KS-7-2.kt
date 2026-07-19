package org.example.app

import kotlin.random.Random

fun main() {
    var code = Random.nextInt(1000, 10000)

    while (true) {
        println("Ваш код авторизации: $code")
        println("Введите код доступа:")
        val userCode = readln().toInt()

        if (userCode == code) {
            println("Добро пожаловать!")
            break  // Выходим из цикла при успехе
        } else {
            println("Неверный код. Отправляем новый...")
            code = Random.nextInt(1000, 10000)
        }
    }
}