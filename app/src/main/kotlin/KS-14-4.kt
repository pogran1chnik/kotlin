package org.example.app

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean
) {
    open fun printInfo() {
        println("Название: $name")
        println("Атмосфера: ${if (hasAtmosphere) "есть" else "нет"}")
        println("Пригодна для высадки: ${if (isHabitable) "да" else "нет"}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean
) : CelestialBody(name, hasAtmosphere, isHabitable) {

    private val satellites = mutableListOf<Satellite>()

    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    fun getSatelliteNames(): List<String> = satellites.map { it.name }

    override fun printInfo() {
        super.printInfo()
        println("Спутники:")
        if (satellites.isEmpty()) {
            println("  (нет спутников)")
        } else {
            satellites.forEach {
                println("  - ${it.name}")
            }
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val orbitalPeriod: Double
) : CelestialBody(name, hasAtmosphere, isHabitable) {

    override fun printInfo() {
        super.printInfo()
        println("Период обращения: $orbitalPeriod дней")
    }
}

fun main() {
    // Создаем спутники
    val moon = Satellite("Луна", false, false, 27.3)
    val phobos = Satellite("Фобос", false, false, 0.32)

    // Создаем планету
    val earth = Planet("Земля", true, true)

    // Добавляем спутники к планете
    earth.addSatellite(moon)
    earth.addSatellite(phobos)

    // Выводим только название планеты и названия спутников
    println("Планета: ${earth.name}")
    println("Спутники: ${earth.getSatelliteNames().joinToString(", ")}")
}