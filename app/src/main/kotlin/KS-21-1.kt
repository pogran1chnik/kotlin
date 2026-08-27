package org.example.app

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"
    return count { it in vowels }
}

fun main() {



    println("Hello".vowelCount())

}