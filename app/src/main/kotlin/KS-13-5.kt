package org.example.app

class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInfo() {
        println("Имя: $name")
        println("Номер: $phoneNumber")
        println("Компания: $company")
    }
}

fun main() {

    println("Введите имя:")
    val name = readln()
    try {
        println("Введите номер:")
        val phoneNumber: Long = readln().toLong()
        println("Введите компанию:")
        val company = readln()
        val contact = Contact5(name, phoneNumber, company)
        println("\nКонтакт создан!")
        contact.printInfo()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.message}")
        println("Некорректный номер телефона. Допустимы только цифры.")
    }

}