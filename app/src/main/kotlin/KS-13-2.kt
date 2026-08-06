package org.example.app

class Contact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        val companyDisplay = company ?: "<не указано>"
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: $companyDisplay")
    }
}
fun main() {
    val contact1 = Contact2("Dima", 79781233267)
    contact1.printInfo()






}