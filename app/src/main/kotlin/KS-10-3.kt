package org.example.app

import kotlin.random.Random



fun main() {

    print("Введите длину пароля:")
    val length = readln().toInt()
    val password = generatePassword(length)
    println("Ваш пароль: $password")
}
fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val specials = "!\"#$%&'()*+,-./ "
    var passwd = ""
    for (i in 0 until length) {
        if (i % 2 == 0) {
            val randomIndex = Random.nextInt(0, 10)
            val digit = digits[randomIndex]
            passwd += digit

        } else {
            val randomSpecial = Random.nextInt(0, 16)
            val special = specials[randomSpecial]
            passwd += special
        }
    }
    return passwd
}