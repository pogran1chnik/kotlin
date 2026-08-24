package org.example.app

class  Spaceship{
    fun takeOff(){
        TODO("Добавить логику взлета: проверка топлива")
    }
    fun land(){
        throw UnsupportedOperationException("Метод приземления еще не реализован")
    }
    fun shootAsteroid(){
        TODO("Добавить логику стрельбы по астероиду")
    }
}

fun main() {

    val ship = Spaceship()
    ship.takeOff()
    ship.land()
    ship.shootAsteroid()


}