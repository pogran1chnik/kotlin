package org.example.app

fun main() {

    val ingredients = listOf(2, 50, 15)


    println("Какое количество порций?")

    val userNumberOfServings = readln().toInt()


    val result = ingredients.map { it * userNumberOfServings }


    println("На $userNumberOfServings порций вам понадобится: Яиц - ${result[0]}, молока - ${result[1]}, сливочного масла - ${result[2]}")
}