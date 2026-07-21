package org.example.app

fun main() {
    // Запрашиваем длину пароля
    println("Введите длину пароля (минимум 6):")
    val length = readln().toInt()

    // Проверяем минимальную длину
    if (length < 6) {
        println("Длина пароля должна быть не менее 6 символов!")
        return
    }

    // Создаем наборы символов
    val lowercase = ('a'..'z').toList()
    val uppercase = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val allChars = (lowercase + uppercase + digits).toList()

    // Создаем список для пароля
    val passwordChars = mutableListOf<Char>()

    // Добавляем по одному символу каждого типа (гарантируем наличие всех типов)
    passwordChars.add(lowercase.random())
    passwordChars.add(uppercase.random())
    passwordChars.add(digits.random())

    // Добавляем остальные символы (длина - 3)
    repeat(length - 3) {
        passwordChars.add(allChars.random())
    }

    // Перемешиваем символы в случайном порядке
    passwordChars.shuffle()

    // Преобразуем список в строку
    val password = passwordChars.joinToString("")

    // Выводим пароль
    println("Ваш пароль: $password")

    // Выводим каждый символ с его позицией (используем forEachIndexed)
    println("\nПроверка символов пароля:")
    password.forEachIndexed { index, char ->
        val type = when {
            char in lowercase -> "строчная"
            char in uppercase -> "заглавная"
            char in digits -> "цифра"
            else -> "другой"
        }
        println("Символ ${index + 1}: $char ($type)")
    }
}