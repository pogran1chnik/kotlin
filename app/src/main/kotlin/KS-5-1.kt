package org.example.app

import kotlin.random.Random

fun main() {
    val oneNumber = Random.nextInt(1, 20)
    val twoNumber = Random.nextInt(1, 10)
    println("Сколько будет $oneNumber + $twoNumber?")
    val answer = oneNumber + twoNumber
    val userAnswer = readln().toInt()
    if (userAnswer == answer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ Запрещен.")
    }
}