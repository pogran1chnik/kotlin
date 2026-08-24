package org.example.app

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: AmmoType? = null

    fun loadAmmo(ammoType: AmmoType) {
        currentAmmo = ammoType
        println("Заряжены ${ammoType.name.lowercase()} патроны")
    }

    fun fire() {
        val ammo = currentAmmo  // ← локальная копия
        if (ammo != null) {
            println("Выстрел! Нанесен урон: ${ammo.damage}")
        } else {
            println("Танк не заряжен!")
        }
    }
}

fun main() {
    val tank = Tank()

    println("=== Попытка выстрела без заряда ===")
    tank.fire()
    println()

    println("=== Зарядка и выстрел ===")
    tank.loadAmmo(AmmoType.BLUE)
    tank.fire()
    println()

    println("=== Зарядка другим типом патронов ===")
    tank.loadAmmo(AmmoType.RED)
    tank.fire()
}