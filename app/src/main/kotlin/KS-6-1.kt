package org.example.app

fun main() {
    println("Создайте логин:")
    val loginUser = readln()
    println("Создайте пароль:")
    val passwordUser = readln()
    var isAuthorized = false
    while (!isAuthorized) {
        println("Введите логин:")
        val autoLogin = readln()
        println("Введите пароль:")
        val autopassword = readln()
        if (loginUser == autoLogin && passwordUser == autopassword) {
            println("Авторизация прошла успешно")
            isAuthorized = true
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }


    }
}