package org.example.app


fun main() {

        val moveString = "D2-D4;0"

        val (move, number) = moveString.split(";")
        val (whereFrom, whereTo) = move.split("-")

        println(whereFrom)
        println(whereTo)
        println(number)
    }


