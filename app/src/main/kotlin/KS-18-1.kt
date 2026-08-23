package org.example.app

class Order(
    val orderId: String,
    private val items: List<String>
) {
    constructor(orderId: String, item: String) : this(orderId, listOf(item))

    fun printOrderInfo(item: String) {
        println("Заказан товар: $item")
    }

    fun printOrderInfo(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    // Заказ с одним товаром
    val order1 = Order("001", "Ноутбук")
    order1.printOrderInfo("Ноутбук")

    // Заказ с несколькими товарами
    val order2 = Order("002", listOf("Книга", "Ручка", "Блокнот"))
    order2.printOrderInfo(listOf("Книга", "Ручка", "Блокнот"))
}