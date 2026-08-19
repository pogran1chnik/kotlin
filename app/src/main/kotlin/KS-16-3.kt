package org.example.app

class User(
    val login: String,
    private val password: String,
){
    fun validatepassword(input: String): Boolean{
        return input == password
    }
}

fun main() {

    val user = User("dima", "12qwe")
    println("Введите парроль:")
    val inputPassword = readln()
    val isValid = user.validatepassword(inputPassword)

    if (isValid){
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}