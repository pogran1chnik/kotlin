package org.example.app


fun main() {
    val rawLogin = "  Android_Dev  "

    // 1. Убери пробелы по краям (trim)
    println(rawLogin.trim().lowercase())
    // 2. Приведи к нижнему регистру (lowercase)
    // 3. Выведи результат и проверь isEmpty()
    println(rawLogin.isEmpty())
}
