package org.example.app

fun main() {
    println("Введите количество секунд:")
    var seconds = readln().toInt()

    while (seconds > 0) {
        Thread.sleep(1000)

        println("Осталось секунд: ${seconds--}")
    }

    println("Время вышло")
}