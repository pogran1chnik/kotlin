package org.example.app


class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printInfo() {
        println("информация о пользователе:")
        println("ID: ${this.id}")
        println("login: ${this.login}")
        println("password: ${this.password}")
        println("email: ${this.email}")
        println("bio: ${this.bio}")
    }

    fun readBio() {
        println("Введите информацию о себе:")
        val readUser = readln()
        bio = readUser
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val oldPassword = readln()

        if (password == oldPassword) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен!")


        } else {
            println("Неверный пароль")
        }
    }
}

fun main() {
    val user = User2(1, "dima", "dima123", "dima123@mail.com")
    println("Начальная информация")
    user.printInfo()
    println()
    println("Заполнение информации о себе")
    user.readBio()
    println()
    println("Смена пароля")
    user.changePassword()
    println()
    println("Обновленная информация")
    user.printInfo()
    println()
}

