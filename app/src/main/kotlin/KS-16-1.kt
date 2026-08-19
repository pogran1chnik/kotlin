package org.example.app

import kotlin.random.Random

class Dice(
    private val value: Int = Random.nextInt(1,7)
){
    fun printValue(){
        println("На кубике выпало: $value")
    }
}


fun main() {

    val dice = Dice()
    dice.printValue()

}