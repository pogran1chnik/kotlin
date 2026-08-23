package org.example.app

import kotlin.random.Random

open class Dice(val sides: Int){
    fun roll(){
        val result = Random.nextInt(1, sides + 1 )
        println("Бросок D$sides: $result")
    }
}
class D4: Dice(4)
class D6: Dice(6)
class D8: Dice(8)

fun main() {

    val dices: List<Dice> = listOf(D4(), D6(), D8())

    println("Броски костей")
    dices.forEach { println(it.roll())}

}