package org.example.app

class Ship(name: String, speed: Double, port: String){
    private var _name = name
    private var _speed = speed
    private var _port = port

    var name: String
        get() = _name
        set(value){
            println("Имя корабля нельзя изменить!")
        }
    var speed: Double
        get() = _speed
        set(value) {
            _speed = value
        }
    var port: String
        get() = _port
        set(value) {
            _port = value
        }
    fun printInfo(){
        println("Имя: $name")
        println("Скорость: $speed")
        println("Порт: $port")
    }
        }

fun main() {

    val ship = Ship("Dima", 50.0, "Red")
    println("Информация о корабле:")
    ship.printInfo()

    ship.speed = 40.0
    ship.port = "Blue"
    ship.name = "R"
    ship.printInfo()


}