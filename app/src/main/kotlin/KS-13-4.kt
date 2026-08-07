package org.example.app

class Contact4(
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

    val contacts = mutableListOf<Contact4>()
    while (true) {
        println("Введите имя:")
        val name = readln().trim()
        if (name == "") {
            println("Имя пустое")
            continue
        }
        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Ошибка!")
            continue
        }
        println("Введите компанию:")
        val companyInput = readln().trim()
        val company = if (companyInput.isEmpty()) null else companyInput


        val contact = Contact4(name, phoneNumber, company)
        contacts.add(contact)
        println("Контакт добавлен")

        contact.printInfo()


        println("Добавить еще? (да/нет)")
        val input = readln()
        if (input.equals("нет", ignoreCase = true)) {
            break
        }


    }


}