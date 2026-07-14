package org.example.app



fun main() {
        val minWeight = 35
        val maxWeight = 100
        val volume = 100
        val oneCargoWeight = 20
        val oneCargoVolume = 80
        val twoCargoWeight = 50
        val twoCargoVolume = 100
        val oneAverage = minWeight < oneCargoWeight && maxWeight >= oneCargoWeight && volume > oneCargoVolume
        val twoAverage = minWeight < twoCargoWeight && maxWeight >= twoCargoWeight && volume > twoCargoVolume
        println("Груз с весом ${oneCargoWeight} и объемом ${oneCargoVolume} соответствует категории 'Average': ${oneAverage}")
        println("Груз с весом ${twoCargoWeight} и объемом ${twoCargoVolume} соответствует категории 'Average': ${twoAverage}")
    }


