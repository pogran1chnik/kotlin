package org.example.app

fun main() {

    println("Ход игрока, бросьте кубик")
    val userNumber = randomNumber()
    println("Ваше число: $userNumber")
    println("Ход компьютера, бросьте кубик")
    val computerNumber = randomNumber()
    println("Число компьютера: $computerNumber")
    if (userNumber > computerNumber){
        println("Победило человечество!")

    } else if(userNumber < computerNumber) {
        println("Победила машина!")
    } else {
        println("Победила дружба")
    }

}

fun randomNumber() : Int {
    return (1 .. 6).random()
}