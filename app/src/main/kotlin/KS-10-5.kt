package org.example.app

import kotlin.random.Random

const val VALID_LOGIN = "admin"
const val VALID_PASSWORD = "12345"

val SHOPPING_CART = listOf(
    "Хлеб",
    "Молоко",
    "Яйца",
    "Масло",
    "Сыр",
    "Колбаса"
)

fun generateToken(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    var token = ""

    repeat(32) {
        token += chars[Random.nextInt(chars.length)]
    }

    return token
}

fun authorize(login: String, password: String): String? {
    return if (login == VALID_LOGIN && password == VALID_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?): List<String>? {
    return if (token != null) {
        SHOPPING_CART
    } else {
        null
    }
}

fun main() {
    val login = "admin"
    val password = "12345"

    val token = authorize(login, password)
    val cart = getCart(token)

    if (cart != null) {
        println("Авторизация успешна! Ваш токен: $token")
        println("\nВаша корзина:")
        cart.forEachIndexed { index, item ->
            println("${index + 1}. $item")
        }
    } else {
        println("Ошибка авторизации. Проверьте логин и пароль.")
    }
}