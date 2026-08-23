package org.example.app

abstract class Animal(
    val name: String
){
    abstract fun eat()
}

class Fox(name: String): Animal(name){
    override fun eat() {
        println("$name -> ягоды")

    }
}
class Dog(name: String): Animal(name) {
    override fun eat() {
        println("$name -> кости")

    }
}
class Cat(name: String): Animal(name) {
    override fun eat() {
        println("$name -> рыба")

    }
}


fun main() {

    val animals: List<Animal> = listOf(Fox("Рыжик"), Dog("Бобик"), Cat("Мурка"))
    animals.forEach { it.eat() }


}