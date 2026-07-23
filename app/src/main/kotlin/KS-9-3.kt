package org.example.app

fun main() {

    val ingredients = listOf(2, 50, 15)
    println("Для одной порции омлета нам понадобится: яйцо - ${ingredients[0]} шт, молоко - ${ingredients[1]} мл, сливочное масло - ${ingredients[2]} гр ")
    println("Какое количество порций?")
    val userNumberOfServings = readln().toInt()
    val eggs = ingredients[0] * userNumberOfServings
    val milk = ingredients[1] * userNumberOfServings
    val butter = ingredients[2] * userNumberOfServings

    println("На $userNumberOfServings порций вам понадобится: Яиц - $eggs, молока - $milk, сливочного масла - $butter")

}