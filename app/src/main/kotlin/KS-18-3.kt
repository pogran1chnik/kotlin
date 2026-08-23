package org.example.app

abstract class Animal(
    val name: String
) {
    abstract fun eat()

    fun sleep() {
        println("$name -> спит")
    }
}
class Fox(name: String): Animal(name){
    override fun eat() {
        println("$name -> ест ягоды")

    }
}
class Dog(name: String): Animal(name) {
    override fun eat() {
        println("$name -> грызет кости")

    }
}
class Cat(name: String): Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")

    }
}


fun main() {

    val animals: List<Animal> = listOf(Fox("Рыжик"), Dog("Бобик"), Cat("Мурка"))
    animals.forEach { it.eat() }

    animals.forEach { it.sleep() }
}