package org.example.app


fun main() {

    val latter = 'a' .. 'z'
    val number = 0 .. 9
    var pin = ""
    for (i in 1 .. 3){
        val randomLatter = latter.random()
        pin += randomLatter
        val randomNumber = number.random()
        pin += randomNumber

    }
    println(pin)

}

