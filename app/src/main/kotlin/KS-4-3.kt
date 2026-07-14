package org.example.app

fun main() {
        val isSunny = true
        val isOpen = true
        val humidity = 20
        val season = "зима"

        println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isOpen && humidity == 20 && season != "зима"}")
}
