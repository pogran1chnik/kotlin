package org.example.app

fun main() {

    println("Введите 5 ингредиентов через запятую с пробелом:")
    val userInput = readln()
    var listToUser = userInput.split(", ")
    listToUser = listToUser.sorted()
    println("Отсортированные ингриденты: $listToUser")

}