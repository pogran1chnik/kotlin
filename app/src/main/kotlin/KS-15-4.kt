package org.example.app

open class Product(
    val name: String,
    var stock: Int
) {
    open fun printInfo() {
        println("Название: $name")
        println("Количество на складе: $stock")
    }
}

interface Searchable {
    fun search()
}

class Instrument(
    name: String,
    stock: Int
) : Product(name, stock), Searchable {

    private val accessories = mutableListOf<Accessory>()

    fun addAccessory(accessory: Accessory) {
        accessories.add(accessory)
    }

    fun getAccessories(): List<Accessory> = accessories

    override fun search() {
        println("Выполняется поиск комплектующих для $name...")
        if (accessories.isEmpty()) {
            println("Комплектующих не найдено")
        } else {
            println("Найдено комплектующих: ${accessories.size}")
            accessories.forEach { accessory ->
                println("  - ${accessory.name} (${accessory.compatibleWith})")
            }
        }
    }

    override fun printInfo() {
        super.printInfo()
        println("Комплектующих: ${accessories.size} шт.")
    }
}

class Accessory(
    name: String,
    stock: Int,
    val compatibleWith: String
) : Product(name, stock) {

    override fun printInfo() {
        super.printInfo()
        println("Совместимо с: $compatibleWith")
    }
}

fun main() {
    // Создаем инструмент
    val guitar = Instrument("Электрогитара", 5)

    // Создаем комплектующие
    val strings = Accessory("Струны для гитары", 20, "Электрогитара")
    val picks = Accessory("Медиаторы", 50, "Электрогитара")
    val cable = Accessory("Инструментальный кабель", 15, "Электрогитара")

    // Добавляем комплектующие к инструменту
    guitar.addAccessory(strings)
    guitar.addAccessory(picks)
    guitar.addAccessory(cable)

    // Выводим информацию
    println("=== Инструмент ===")
    guitar.printInfo()
    println()

    println("=== Комплектующие ===")
    guitar.getAccessories().forEach { accessory ->
        accessory.printInfo()
        println()
    }

    println("=== Поиск комплектующих ===")
    guitar.search()
}