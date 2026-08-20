package org.example.app

class Order(
    private val orderId: Int,
    private var status: String
) {
    fun getStatus(): String {
        return status
    }

    fun getOrder(): Int {
        return orderId
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun changeStatus(newStatus: String) {
        println("Отправка заявки менеджеру...")
        this.updateStatus(newStatus)
        println("Статус изменен на: $newStatus")
    }

    fun printInfo() {
        println("Заказ #$orderId: статус '$status'")
    }
}

fun main() {
    val order = Order(1, "Новый")

    println("Информация о заказе")
    order.printInfo()
    println()

    println("Изменение статуса")
    order.changeStatus("В обработке")
    println()

    println("Обновленная информация")
    order.printInfo()
}