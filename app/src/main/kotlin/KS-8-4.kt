package org.example.app

fun main() {

    val ingredients = arrayOf("рис", "барбарис", "мясо", "морковка", "перец")


    println("Список ингредиентов: ${ingredients.joinToString(", ")}")


    println("Какой ингредиент вы хотите заменить?")
    val oldIngredient = readln().trim()


    val index = ingredients.indexOfFirst { it.lowercase() == oldIngredient.lowercase() }

    if (index != -1) {

        println("На какой ингредиент вы хотите заменить?")
        val newIngredient = readln().trim()


        ingredients[index] = newIngredient


        println("Готово! Вы сохранили следующий список: $ingredients")
    } else {

        println("Ингредиент '$oldIngredient' не найден в списке")
    }
}