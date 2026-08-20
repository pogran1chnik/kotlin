package org.example.app

class Order(
    private val orderId: Int,
    private var status: String,
){
    fun getStatus(): String{
        return status
    }
    fun getOrder(): Int{
        return orderId
    }
    private fun updateStatus(newStatus: String) {
        status = newStatus
    }
        fun prinInfo(){
        println("Заказ #$orderId: статус '$status'")
    }

    fun manageOrder(order: Order, newStatus: String) {
        println("Отправка заявки менеджеру...")
        order.updateStatus(newStatus)
        println("Статус изименен на: $newStatus")
    }
}
fun main() {

    val order = Order(1, "Новый")
    println("Информация о заказе")
    order.prinInfo()
    println()

    println("Изменение статуса")
    order.manageOrder(order, "В обработке")
    println()

    println("Обновленная информация")
    order.prinInfo()

}