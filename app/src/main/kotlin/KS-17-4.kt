package org.example.app

class Package(val trackingNumber: String, initialLocation: String){
    private var _location: String = initialLocation
    private var _moveCount: Int = 0

    var location: String
        get() = _location
        set(value) {
            _location = value
            _moveCount++

        }
    val moveCount: Int
        get() = _moveCount

    fun printInfo() {
        println("Номер посылки: $trackingNumber")
        println("Текущее местоположение: $_location")
        println("Количество перемещений: $_moveCount")
        println()
    }
}

fun main() {

    val package1 = Package("PKG-12345", "Москва")

    println("=== Создание посылки ===")
    package1.printInfo()


    println("=== Прибытие в новые пункты ===")
    package1.location = "Санкт-Петербург"
    package1.location = "Казань"
    package1.location = "Екатеринбург"
    println()


    println("=== Итог ===")
    package1.printInfo()

}