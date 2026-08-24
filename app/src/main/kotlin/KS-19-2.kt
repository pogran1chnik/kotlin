package org.example.app

enum class Category(val displayName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Разное");

    fun getDisplayName(): String = displayName


}

class Product(
    val id: Int,
    val name: String,
    val category: Category
) {
    fun printInfo() {
        println("Товар: $name (ID: $id)")
        println("Категория: ${category.getDisplayName()}")
    }

}

fun main() {

    val product1 = Product(1, "Футболка", Category.CLOTHING)
    val product2 = Product(2, "Тетрадь", Category.STATIONERY)
    val product3 = Product(3, "Батарейки", Category.MISCELLANEOUS)

    println("=== Товары ===\n")

    product1.printInfo()
    product2.printInfo()
    product3.printInfo()


}