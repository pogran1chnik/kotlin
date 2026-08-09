package org.example.app

open class Liner1(
    val name: String,
    open var speed: Int = 30,
    open var capacity: Int = 500,
){
    open fun printInfo(){
        println("Название: $name")
        println("Скорость: $speed")
        println("Вместимость: $capacity")
    }
    open fun load(){
        println("выдвигает горизонтальный трап")
    }
}

class CargoShip1(
    name: String,
    val cargoCapacity: Int = 1000
    ) : Liner1(name) {
    override var speed: Int = 15
    override var capacity: Int = 200
    override fun printInfo() {
        super.printInfo()
        println("Грузоподъемность: $cargoCapacity")
    }

    override fun load() {
        println("активирует погрузочный кран")
    }

}

class Icebreaker1(name: String) : Liner1(name) {
    override var speed: Int = 10
    override var capacity: Int = 100
    val canBreakIce: Boolean = true
    override fun printInfo() {
        super.printInfo()
        println("Ломает леда: ${if (canBreakIce) "да" else "нет"}")
    }

    override fun load() {
        println("открывает ворота со стороны кормы")
    }
}
fun main() {

    println("Лайнер")
    val liner1 = Liner1(name = "Titanik")
    liner1.printInfo()
    liner1.load()

    println("Грузовой корабль")
    val cargo = CargoShip1("BMRT", 100)
    cargo.printInfo()
    cargo.load()


    println("Ледокол")
    val icebreaker = Icebreaker1("Arctika")
    icebreaker.printInfo()
    icebreaker.load()
}