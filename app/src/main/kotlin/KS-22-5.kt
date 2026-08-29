package org.example.app

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceLightYears: Double,
    )
fun main() {

    val guide = GalacticGuide("Alpha Centauri", "Ближайшая к Солнечной системе звездная система", "2024-01-15 14:30:00", 4.37)
    val name = guide.component1()
    val description = guide.component2()
    val dateTime = guide.component3()
    val distance = guide.component4()

    println("=== Информация о звездной системе ===")
    println("Название: $name")
    println("Описание: $description")
    println("Дата и время: $dateTime")
    println("Расстояние от Земли: $distance световых лет")


}