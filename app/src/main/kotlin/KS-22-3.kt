package org.example.app

data class Person(
    val name: String,
    val age: Int,
    val city: String,
)
fun main() {

    val person = Person("dima", 23, "Crimea")
    val (name, age, city) = person
    println("Имя: $name")
    println("Возраст: $age")
    println("Город: $city")

}