package org.example.app

fun main() {
    val ingredients = mutableListOf("молоко", "яйцо", "перец")

    println("В рецепте есть базовые ингредиенты: $ingredients")
    println("Желаете добавить еще?")

    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        ingredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
    }
}