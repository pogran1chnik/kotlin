package org.example.app

const val ADULT_AGE = 18
const val YEAR_TODAY = 2026

fun main() {

    println("Введите ваш год рождения:")
    val userAdultAge = readln().toInt()
    val differenceAge = YEAR_TODAY - userAdultAge
    if (differenceAge >= ADULT_AGE){
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }
}