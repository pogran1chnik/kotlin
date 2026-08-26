package org.example.app



fun main() {

    fun String.countVowels(): Int {
        val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"
        return count { it in vowels }
    }


    println("Hello".countVowels())

}