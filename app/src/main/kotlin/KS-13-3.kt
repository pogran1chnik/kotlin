package org.example.app

class Contact3(
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

    val contacts = listOf(
        Contact3("Anna", 79877653423, "Google"),
        Contact3("Дмитрий", 79234567890, null),
        Contact3("Мария", 79345678901, "null"),
        Contact3("Иван", 79456789012, "Yandex"),
        Contact3("Петр", 79567890123, null)
    )
    val companies = contacts.mapNotNull{it.company}
    println(companies)




}