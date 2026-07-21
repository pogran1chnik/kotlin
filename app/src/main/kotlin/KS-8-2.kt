package org.example.app



fun main() {

    val ingridients = arrayOf("рис", "барбарис", "мясо", "морковка", "перец")
    println("Введите ингредиент для поиска:")
    val useringridients = readln()
    for (i in ingridients){
        if (useringridients == i){
            println("Ингредиент $useringridients в рецепте есть")
            return
        }

    }

    println("Такого ингредиента в рецепте нет")
}