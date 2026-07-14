package org.example.app

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
        val oneCargoWeight = 20
        val oneCargoVolume = 80
        val twoCargoWeight = 50
        val twoCargoVolume = 100

        println("Груз с весом ${oneCargoWeight} и объемом ${oneCargoVolume} соответствует категории 'Average': ${MIN_WEIGHT < oneCargoWeight && MAX_WEIGHT >= oneCargoWeight && MAX_VOLUME > oneCargoVolume}")
        println("Груз с весом ${twoCargoWeight} и объемом ${twoCargoVolume} соответствует категории 'Average': ${MIN_WEIGHT < twoCargoWeight && MAX_WEIGHT >= twoCargoWeight && MAX_VOLUME > twoCargoVolume}")
}


