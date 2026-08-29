package org.example.app

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

    /*
    Объяснение:
RegularBook2 — обычный класс, не переопределяет toString(),
поэтому выводится имя класса и хеш-код объекта.

DataBook2 — data class, автоматически переопределяет toString(),
выводятся все свойства объекта в читаемом формате.
     */

}