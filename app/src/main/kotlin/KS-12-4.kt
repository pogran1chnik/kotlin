package org.example.app


class WeatherKelvin(dayKelvin: Int, nightKelvin: Int, hasPrecip: Boolean) {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = false

    init {
        dayTemperature = dayKelvin - 273
        nightTemperature = nightKelvin - 273
        hasPrecipitation = hasPrecip
        require(dayKelvin >= 0) { "Температура не может быть ниже абсолютного нуля (0K)" }
        require(nightKelvin >= 0) { "Температура не может быть ниже абсолютного нуля (0K)" }
        require(dayKelvin in 0..500) { "Некорректное значение дневной температуры" }
        require(nightKelvin in 0..500) { "Некорректное значение ночной температуры" }


        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: ${if (hasPrecip) "есть" else "нет"}")

    }
}

fun main() {
    val weather = WeatherKelvin(300, 290, false)

}