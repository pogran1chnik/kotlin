package org.example.app

const val ALL_TABLE = 13

fun main() {

        val firstBookTable = 13
        val secondBoolTable = 9
        val availabilityTodayTable: Boolean = ALL_TABLE > firstBookTable
        val availabilityTomorrowTable: Boolean = ALL_TABLE > secondBoolTable
        println("[Доступность столиков на сегодня: $availabilityTodayTable]\n[Доступность столиков на завтра: $availabilityTomorrowTable]")

    }


