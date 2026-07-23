package org.example.app

fun main() {

    val ingredients = mutableSetOf<String>()

    repeat(5) { index ->
        println("Введите ингредиент ${index + 1}:")
        val input = readln().trim()
        ingredients.add(input)
    }
    val sortedList = ingredients.sorted()
    val formattedList = sortedList.toMutableList()

    if (formattedList.isNotEmpty()) {
        formattedList[0] = formattedList[0].replaceFirstChar { it.uppercase() }
    }

    println("Результат: ${formattedList.joinToString(", ")}")
}

