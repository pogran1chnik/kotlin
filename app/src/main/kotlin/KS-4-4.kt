package org.example.app

fun main() {
    val day = 6

    val arms = day % 2 == 1
    val legs = day % 2 == 0
    val back = day % 2 == 0
    val abs = day % 2 == 1

    println("Упражнения для рук:   $arms\nУпражнения для ног:   $legs\nУпражнения для спины:  $back\nУпражнения для пресса: $abs")
}