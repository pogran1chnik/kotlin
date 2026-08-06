package org.example.app

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printInfo() {
        println("Имя: $name")
        println("Телефон: $phoneNumber")
        println("Компания: ${company ?: "Не указана"}")
    }
}
fun main() {

    val contact1 = Contact("Dima", 79787432221, null)
    val contact2 = Contact("Anna", 79233456521, "Google")
    contact1.printInfo()
    contact2.printInfo()




}