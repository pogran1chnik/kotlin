package org.example.app


import kotlin.random.Random

fun main() {

    var attempts = 3
    while (attempts > 0) {
        val onetNumber = Random.nextInt(1, 10)
        val twoNumber = Random.nextInt(1, 10)
        val correctAnswer = onetNumber + twoNumber
        println("Сколько будет $onetNumber + $twoNumber?")
        val userAnswer = readln().toInt()
        if (userAnswer == correctAnswer){
            println("Добро пожаловать!")
            break
        }else{
            attempts--
            println("Неверно. Осталось попыток: $attempts")
            continue
        }
    }
    if (attempts == 0){
        println("Доступ запрещен")
    }
}