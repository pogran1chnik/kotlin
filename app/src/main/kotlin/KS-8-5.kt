package org.example.app

fun main() {

    println("Введите количество ингридиентов:")

    val count = readln().toInt()
    var ingredients = Array(count) { "" }
     for (i in 0 until count){
         println("Введите ингредиент ${i + 1}:")
         val newIngridient = readln()
         ingredients[i] = newIngridient
     }
    println("Ваши ингридиенты: ${ingredients.joinToString(", ")}")
}