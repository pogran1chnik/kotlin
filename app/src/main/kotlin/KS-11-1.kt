package org.example.app


class  User(
    var id: Int,
    val login: String,
    val password: String,
    val email: String,
)


fun main() {

    val user1 = User(1, "alice", "alice123", "alice@mail.ru" )
    val user2 = User(2, "dima", "dima123", "dima12345@mail.com")
    println("Пользователь 1:")
    println("ID: ${user1.id}")
    println("Логин: ${user1.login}")
    println("Пароль: ${user1.password}")
    println("Почта: ${user1.email}")

    println("\nПользователь 2:")
    println("ID: ${user2.id}")
    println("Логин: ${user2.login}")
    println("Пароль: ${user2.password}")
    println("Почта: ${user2.email}")
}