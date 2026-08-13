package org.example.app


abstract class WeatherStationStats(
    var timestamp: String,
){
    abstract fun getData(): String
}

class Temperature(
    val value: Double,
    timestamp: String,
    val unit: String = "°C",

) : WeatherStationStats(timestamp){
    override fun getData(): String = "$value$unit"
}

class PrecipitationAmount(
    val value: Double,
    timestamp: String,
    val unit: String = "мм",

) : WeatherStationStats(timestamp){
    override fun getData(): String = "$value$unit"
}
class WeatherServer{
    fun send(stats: WeatherStationStats){
        if (stats is Temperature){
            println("Температура: ${stats.getData()}, Время: ${stats.timestamp}")
        }
        if (stats is PrecipitationAmount){
            println("Осадки: ${stats.getData()}, Время: ${stats.timestamp}")
        }
    }
}

fun main() {
    val temp = Temperature(25.5, "2024-01-15 14:30:00")
    val precip = PrecipitationAmount(12.1, "2024-01-15 14:30:00")
    val server = WeatherServer()

    println("Отправка данных на сервер")
    server.send(temp)
    server.send(precip)

}
