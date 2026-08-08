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


    try {
        println("Введите номер:")
        val phoneNumber: Long = readln().toLong()
        val contact = Contact5(name = "Dima", phoneNumber, company = "Google")
        println("\nКонтакт создан!")
        contact.printInfo()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName}")
        println("Некорректный номер телефона. Допустимы только цифры.")
    }

}