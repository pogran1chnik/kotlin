package org.example.app

interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int)
    fun unloadPassengers(count: Int)
}

interface CargoTransport {
    val maxCargo: Double
    var currentCargo: Double

    fun loadCargo(weight: Double)
    fun unloadCargo(weight: Double)
}

class PassengerCar : Movable, PassengerTransport {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Ошибка: Превышение лимита пассажиров! Максимум: $maxPassengers")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Ошибка: Недостаточно пассажиров для выгрузки")
        }
    }

    override fun move() {
        println("Легковой автомобиль едет...")
    }
}

class Truck : Movable, PassengerTransport, CargoTransport {
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0

    override val maxCargo: Double = 2.0
    override var currentCargo: Double = 0.0

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Ошибка: Превышение лимита пассажиров! Максимум: $maxPassengers")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Текущее количество: $currentPassengers")
        } else {
            println("Ошибка: Недостаточно пассажиров для выгрузки")
        }
    }

    override fun loadCargo(weight: Double) {
        if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Загружено $weight тонн груза. Текущий груз: $currentCargo тонн")
        } else {
            println("Ошибка: Превышение грузоподъемности! Максимум: $maxCargo тонн")
        }
    }

    override fun unloadCargo(weight: Double) {
        if (currentCargo - weight >= 0) {
            currentCargo -= weight
            println("Выгружено $weight тонн груза. Текущий груз: $currentCargo тонн")
        } else {
            println("Ошибка: Недостаточно груза для выгрузки")
        }
    }

    override fun move() {
        println("Грузовой автомобиль едет...")
    }
}

fun main() {
    println("=== Перевозка пассажиров и грузов ===\n")

    // Создаем автомобили
    val car1 = PassengerCar()
    val car2 = PassengerCar()
    val truck = Truck()

    // Перевозка пассажиров (6 человек)
    println("--- Перевозка пассажиров ---")
    car1.loadPassengers(3)
    car1.move()
    println()

    car2.loadPassengers(3)
    car2.move()
    println()

    // Перевозка груза (2 тонны)
    println("--- Перевозка груза ---")
    truck.loadCargo(2.0)
    truck.move()
    println()

    // Итог
    println("=== Итог ===")
    println("Всего перевезено пассажиров: 6 человек")
    println("Всего перевезено груза: 2.0 тонн")
}