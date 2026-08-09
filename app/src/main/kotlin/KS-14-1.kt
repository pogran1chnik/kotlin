package org.example.app

open class Liner(
    val name: String,
    open var speed: Int = 30,
    open var capacity: Int = 500,
){
    open fun printInfo(){
        println("Название: $name")
        println("Скорость: $speed")
        println("Вместимость: $capacity")
    }
}

class CargoShip(
    name: String,
    val cargoCapacity: Int = 1000
    ) : Liner(name) {
    override var speed: Int = 15
    override var capacity: Int = 200
    override fun printInfo() {
        println("Название: $name")
        println("Скорость: $speed")
        println("Вместимость: $capacity")
        super.printInfo()
        println("Грузоподъемность: $cargoCapacity")
    }

}

class Icebreaker(name: String) : Liner(name) {
    override var speed: Int = 10
    override var capacity: Int = 100
    val canBreakIce: Boolean = true
    override fun printInfo() {
        println("Название: $name")
        println("Скорость: $speed")
        println("Вместимость: $capacity")
        super.printInfo()
        println("Ломает леда: ${if (canBreakIce) "да" else "нет"}")
    }

}
fun main() {

    println("Лайнер")
    val liner1 = Liner(name = "Titanik")
    liner1.printInfo()

    println("Грузовой корабль")
    val cargo = CargoShip("BMRT", 100)
    cargo.printInfo()

    println("Ледокол")
    val icebreaker = Icebreaker("Arctika")
    icebreaker.printInfo()
}