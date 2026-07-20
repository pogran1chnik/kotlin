package org.example.app

fun main() {
    println("Введите количество секунд:")
    val userNumber = readln().toInt()

    for (i in userNumber downTo  1 ) {
        println("Времени осталось до конца $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}