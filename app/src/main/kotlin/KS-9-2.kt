package org.example.app

fun main() {

    val ingridient = mutableListOf("молоко", "яйцо", "перец")
    println("В рецепте есть базовые ингредиенты: ${ingridient.joinToString(", ")}")
    println("Желаеете добавить еще?")
    val userAnswer = readln()
    if ( userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngridient = readln()
        ingridient.add(newIngridient)
        println("Теперь в рецепте есть следующие ингредиенты: ${ingridient.joinToString(", ")}")
    }



}