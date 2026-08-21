package org.example.app

class QuizItem(question: String, answer: String){
    private var _question: String = question
    private var _answer: String = answer
    val question: String
        get() = _question
    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}

fun main() {

    val item = QuizItem("Столица Франции?", "Париж")

    println("Вопрос: ${item.question}")
    println("Ответ: ${item.answer}")

    item.answer = "Лион"
    println("Измененный ответ: ${item.answer}")
}