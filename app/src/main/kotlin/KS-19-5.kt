package org.example.app


enum class Gender {
    MALE,
    FEMALE
}

class Person(
    val name: String,
    val gender: Gender
) {
    fun printInfo() {
        println("Имя: $name")
        println("Пол: $gender")
    }
}


fun main() {

    println("Картотека")
    println("Введите данные 5 человек в формате: \"Имя, Пол\"")
    println("Доступные значения пола: MALE, FEMALE")

    val people = mutableListOf<Person>()

    var i = 1

    while (i <= 5) {
        println("Введите человека $i:")
        val input = readln().trim()

        val parts = input.split(",").map { it.trim() }
        if (parts.size != 2) {
            println("Ошибка! Введите в формате: 'Имя, Пол'")
            continue  // не увеличиваем i
        }

        val name = parts[0]
        val genderString = parts[1].uppercase()

        try {
            val gender = Gender.valueOf(genderString)
            people.add(Person(name, gender))
            i++  // увеличиваем только при успехе
        } catch (e: IllegalArgumentException) {
            println("Ошибка! Неверное значение пола: $genderString")
            println("Доступные значения: MALE, FEMALE")
            // i не увеличивается
        }
    }

    println()
    println("=== Список картотеки ===")
    people.forEachIndexed { index, person ->
        print("${index + 1}. ")
        person.printInfo()
    }
}

