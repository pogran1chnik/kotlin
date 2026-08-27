package org.example.app

import java.io.File

fun File.writeWordToBeginning(word: String) {
    val lowerWord = word.lowercase()
    val newContent = if (this.exists()) {
        val oldContent = this.readText()
        "$lowerWord\n$oldContent"
    } else {
        lowerWord
    }
    this.writeText(newContent)
}

fun main() {
    val file = File("words.txt")

    // Записываем слова в начало файла
    file.writeWordToBeginning("Hello")
    file.writeWordToBeginning("World")
    file.writeWordToBeginning("Kotlin")

    // Читаем и выводим содержимое файла
    println("Содержимое файла:")
    println(file.readText())
}