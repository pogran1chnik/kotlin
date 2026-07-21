package org.example.app



fun main() {

    val ingridients = arrayOf("рис", "барбарис", "мясо", "морковка", "перец")
    println("Введите ингредиент для поиска:")
    val useringridients = readln()
    if (useringridients in ingridients) {
        println("Ингредиент $useringridients в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")

    }
}


