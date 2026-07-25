package org.example.app

fun main() {

    println("Введите логин:")
    val loginUser = readln()
    println("Введите пароль:")
    val passwordUser = readln()

    if (validateLogin(loginUser, passwordUser) ) {
        println("Регистрация успешна! Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateLogin(login: String, password: String): Boolean {
    return login.length >= 4 && password.length >= 4
}