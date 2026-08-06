package org.example.app

import kotlin.random.Random

class WeatherData(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPrecipitation: Boolean,


)

fun main() {

    val weatherList = List(30) {
        val dayTemp = Random.nextInt(-10, 35)
        val nightTemp = Random.nextInt(-15, 25)
        val hasPrecip = Random.nextBoolean()
        WeatherData(dayTemp, nightTemp, hasPrecip)
    }
    val dayTemps = weatherList.map {it.dayTemperature}
    val nightTemps = weatherList.map {it.dayTemperature}

    val rainyDays = weatherList.count {it.hasPrecipitation}

    val avgDayTemp = dayTemps.average()
    val avgNightTemp = nightTemps.average()

    println("Статистика погоды за месяц (30 дней)")
    println("Средняя дневная температура: ${String.format("%.1f", avgDayTemp)}°C")
    println("Средняя ночная температура: ${String.format("%.1f", avgNightTemp)}°C")
    println("Количество дней с осадками: $rainyDays")



}