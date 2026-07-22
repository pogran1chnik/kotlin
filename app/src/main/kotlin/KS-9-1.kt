package org.example.app

fun main() {

    val ingridient = listOf<String>("молоко", "яйцо", "перец", "соль")
    println("В рецепте есть следующие ингредиенты: ${ingridient.joinToString(", ")}")

    ingridient.forEach { it ->
        println("$it")
    }
}