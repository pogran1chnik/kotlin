package org.example.app

fun main() {
    println("Введите количество секунд:")
    var seconds = readln().toInt()

    while (seconds > 0) {


        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}