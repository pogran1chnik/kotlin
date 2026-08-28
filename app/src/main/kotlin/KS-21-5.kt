package org.example.app

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Магия" to 150,
        "Меч" to 200,
        "Лук" to 100
    )

    val maxSkill = skills.maxCategory()
    println("Навык с максимальным опытом: $maxSkill")
}