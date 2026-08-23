package org.example.app

class Order(
    val orderId: String,
    private val items: List<String>
) {
    constructor(orderId: String, item: String) : this(orderId, listOf(item))

    fun printOrderInfo() {
        printOrderInfo(items)
    }

    private fun printOrderInfo(item: String) {
        println("Заказан товар: $item")
    }

    private fun printOrderInfo(items: List<String>) {
        if (items.isEmpty()) {
            println("Заказ пуст")
        } else {
            println("Заказаны следующие товары: ${items.joinToString(", ")}")
        }
    }
}

fun main() {

    val order1 = Order("001", "Ноутбук")
    println("=== Заказ 1 ===")
    order1.printOrderInfo()
    println()

    val order2 = Order("002", listOf("Книга", "Ручка", "Блокнот"))
    println("=== Заказ 2 ===")
    order2.printOrderInfo()
    println()


    val order3 = Order("003", listOf())
    println("=== Заказ 3 ===")
    order3.printOrderInfo()
}