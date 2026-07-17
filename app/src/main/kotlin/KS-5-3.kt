package org.example.app



fun main() {
    val oneNumber = 3
    val twoNumber = 41
    println("Введите первое число (от 0 до 42):")
    val oneEnter = readln().toInt()
    println("Введите второе число (от 0 до 42):")
    val twoEnter = readln().toInt()
    if (oneNumber == oneEnter && twoNumber == twoEnter || oneNumber == twoEnter && twoNumber == oneEnter){
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (oneNumber == oneEnter || twoNumber == twoEnter){
        println("Вы выиграли утешительный приз!")
    }else{
        println("Неудача!")
    }
}