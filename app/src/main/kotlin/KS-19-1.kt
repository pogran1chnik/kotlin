package org.example.app

enum class Fish(val displayName: String){
    GUPPY("GUPPY"),
    ANGELFISH("ANGELFISH"),
    GOLDFISH("GOLDFISH"),
    SIAMESE_FIGHTING_FISH("SIAMESE_FIGHTING_FISH")

}

fun main() {

    println("Вы можете добавить в аквариум:")
    Fish.values().forEach { fish ->
        println("- ${fish.displayName}")
    }


}