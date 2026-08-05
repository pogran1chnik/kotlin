package org.example.app


class WeatherInfo(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var hasPrecipitation: Boolean,
){
    init {
        require(dayTemperature >= -50 && dayTemperature <= 50) {
            "Температура должна быть в диапазоне -50..50"
        }
        println("Создан объект погоды: днем $dayTemperature°C")
    }


    fun printInfo() {
        println("Дневная температура: $dayTemperature")
        println("Ночная температура: $nightTemperature")
        println("Осадки: $hasPrecipitation")
    }
}

fun main() {

    val weather1 = WeatherInfo(25,15,false)
    val weather2 = WeatherInfo(15,5,true)
    weather1.printInfo()
    weather2.printInfo()


}