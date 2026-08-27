package org.example.app

fun List<Int>.evenNumbersSum(): Int = filter { it % 2 == 0 }.sum()

fun main() {


    println(listOf(1, 2, 3, 4, 5).evenNumbersSum())
}