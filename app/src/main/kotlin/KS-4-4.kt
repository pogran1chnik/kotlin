package org.example.app

fun main() {

    val day = 5

    var arms = day % 2 == 1
    var legs = day % 2 == 0
    var back = day % 2 == 0
    var abs = day % 2 == 1

    println("Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $abs")

}
