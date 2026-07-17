package org.example.app

fun main() {
    println("Введите ваше имя пользователя:")
    val name = readln()

    when (name) {
        "Zaphod" -> {
            println("Введите пароль:")
            val password = readln()

            when (password) {
                "PanGalactic" -> println("Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\".")
                else -> println("Неверный пароль. Доступ запрещен.")
            }
        }
        else -> println("Пользователь не найден. Пожалуйста, зарегистрируйтесь.")
    }
}