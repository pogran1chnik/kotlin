package org.example.app


interface Flyable {
    fun fly(): String
}

interface Swimmable {
    fun swim(): String
}

class Carp() : Swimmable {
    override fun swim(): String = "Карась плавает в воде"
}

class Seagull() : Flyable, Swimmable {
    override fun fly(): String = "Чайка летает в небе"
    override fun swim(): String = "Чайка плавает на поверхности воды"
}

class Duck() : Flyable, Swimmable {
    override fun fly(): String = "Утка летает низко над водой"
    override fun swim(): String = "Утка плавает в пруду"
}

fun main() {

    val duck = Duck()
    val seagull = Seagull()
    val carp = Carp()
    println("Утка")
    println(duck.fly())
    println(duck.swim())
    println("Чайка")
    println(seagull.fly())
    println(seagull.swim())
    println("Карась")
    println(carp.swim())
}
