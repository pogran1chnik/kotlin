package org.example.app


val greeting: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }

fun main() {

    val user = greeting("Алексей")
    println(user)
}


