package org.example.app

class Circle(
    private val radius: Double
){
    private val PI: Double = 3.14
    fun getCircumference(): Double{
        return 2 * PI * radius
    }
    fun getArea(): Double{
        return PI * radius * radius
    }
}

fun main() {

    val circle = Circle(5.0)
    val circumference = circle.getCircumference()
    val area = circle.getArea()
    println("Круг с радиусом $circle")
    println("Длина окружности: $circumference")
    println("Площадь: $area")
}