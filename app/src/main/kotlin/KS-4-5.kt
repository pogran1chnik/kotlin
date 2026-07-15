package org.example.app

fun main() {

    val hasDamage = false
    val crew = 60
    val provision = 55
    val weather = true


    val canSail = (!hasDamage && crew in 55..70 && provision > 50) ||
            (hasDamage && crew == 70 && weather && provision >= 50)

    println("Может ли корабль отправиться в плавание? $canSail")
}