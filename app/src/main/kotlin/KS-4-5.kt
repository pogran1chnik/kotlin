package org.example.app

fun main() {
    // Ввод данных с консоли
    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readln().toBoolean()

    println("Введите текущий состав экипажа:")
    val crew = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val provision = readln().toInt()

    println("Введите благоприятность метеоусловий (true/false):")
    val weather = readln().toBoolean()

    // Единое составное условие только с логическими операторами
    val canSail = (!hasDamage && crew >= 55 && crew <= 70 && provision > 50) ||
            (hasDamage && crew == 70 && weather && provision >= 50)

    println("Может ли корабль отправиться в плавание? $canSail")
}