package org.example.app

fun main() {

        val day = 5
        var arms = true
        var legs = false
        var back = false
        var abs = true

        arms = day % 2 == 1
        legs = day % 2 == 0
        back = day % 2 == 0
        abs = day % 2 == 1

        println("Упражнения для рук: $arms\nУпражнения для ног: $legs\nУпражнения для спины: $back\nУпражнения для пресса: $abs")

}
