package org.example.app

class User(login: String, password: String){
    private var _login: String = login
    private var _password: String = password

    var login: String
        get() = _login
        set(value) {
            _login = value
            println("Логин изменен на: $value")
        }
    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
    fun printInfo(){
        println("Логин: $login")
        println("Пароль: $password")
        println()
    }
}

fun main() {


    val user = User("admin", "12345")

    println("=== Создание пользователя ===")
    user.printInfo()

    println("=== Попытка изменить пароль ===")
    user.password = "newPassword"
    println("После попытки изменения:")
    user.printInfo()

    println("=== Успешная смена логина ===")
    user.login = "super_admin"
    user.printInfo()

}