package org.example.app


class WeatherKelvin(dayKelvin: Int, nightKelvin: Int, hasPrecip: Boolean){
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = false

    init {
        dayTemperature = dayKelvin - 273
        nightTemperature = nightKelvin - 273
        hasPrecipitation = hasPrecip
    }

    fun printInfo(){
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $hasPrecipitation")
    }
}


fun main() {
    val weather = WeatherKelvin(300, 290, false)
    weather.printInfo()




}