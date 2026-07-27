package org.example.app


fun rollDice(): Int {
    return (1..6).random()
}

fun playRound(roundNumber: Int): Boolean {
    println("Раунд $roundNumber:")
    val userRoll = rollDice()
    val computerRoll = rollDice()
    println("Вам выпало: $userRoll")
    println("Компьютеру выпало: $computerRoll")
    if (userRoll > computerRoll) {
        println("Вы выиграли раунд!")
        return true
    } else if (userRoll < computerRoll) {
        println("Вы проиграли раунд!")
        return false
    } else {
        println("Ничья!")
        return false
    }

}

fun main() {

    var wins = 0
    var round = 1
    while (true) {
        val isWin = playRound(round)
        if (isWin) {
            wins++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val answer = readln()
        if (answer.equals("Нет", ignoreCase = true)) {
            break

        }
        round++
    }
    println("Количество выигранных партий: $wins")
}


