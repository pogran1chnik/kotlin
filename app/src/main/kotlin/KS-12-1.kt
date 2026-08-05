package org.example.app


class WeatherData(){
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = false


    fun printInfo() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $hasPrecipitation")
    }
}

fun main() {
    val weather1 = WeatherData()
    weather1.dayTemperature = 25
    weather1.nightTemperature = 15
    weather1.hasPrecipitation = false
    val weather2 = WeatherData()
    weather2.dayTemperature = 15
    weather2.nightTemperature = 5
    weather2.hasPrecipitation = true
    weather1.printInfo()
    weather2.printInfo()


}