package org.example.app


fun main() {
    // Переменная для имени пользователя
    val userName = "Алексей"

    // Переменная для приветствия (будем перезаписывать)
    var greeting = "Доброе утро" // начальное значение

    // Дневное приветствие
    greeting = "Добрый день"
    println("$greeting, $userName!")

    // Вечернее приветствие (перезаписываем ту же переменную)
    greeting = "Добрый вечер"
    println("$greeting, $userName!")
}

