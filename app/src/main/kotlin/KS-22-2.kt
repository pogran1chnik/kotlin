package org.example.app

import kotlin.random.Random

class RegularBook(
    val title: String,
    val author: String
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {

    val regular = RegularBook("123", "321")
    val data = DataBook("213", "123")
    println(regular)
    println(data)

}