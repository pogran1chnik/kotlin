package org.example.app

class Order(
    val orderId: String,
    private val items: List<String>,
) {
    constructor(orderId: String, item: String) : this(orderId, listOf(item))

    fun printOrderInfo() {
        if (items.isEmpty()) {
            println("Заказ пуст")
        } else if (items.size == 1) {
            println("Заказ товар: ${items[0]}")
        } else {
            println("Заказаны следующие товары: ${items.joinToString(",")}")
        }
    }
}

fun main() {
    println("Заказ №1")
    val order1 = Order("001", "Netbook")
    order1.printOrderInfo()
    println()
    println("Заказа №2")
    val order2 = Order("002", listOf("Book", "Pen", "Apple"))

    order2.printOrderInfo()


}