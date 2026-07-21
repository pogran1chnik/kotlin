package org.example.app

import kotlin.random.Random

fun main() {
    // Запрашиваем длину пароля
    println("Введите длину пароля (минимум 6):")
    var length = readln().toInt()

    // Автоматически корректируем длину до минимальной
    if (length < 6) {
        println("Длина пароля не может быть меньше 6. Установлена длина 6.")
        length = 6
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
}