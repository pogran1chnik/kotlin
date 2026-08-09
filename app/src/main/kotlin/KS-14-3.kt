package org.example.app

import kotlin.math.PI

const val COLOR_BLACK = "черный"
const val COLOR_WHITE = "белый"

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}
    class Circle(val radius: Double, color: String): Figure(color){
        override fun area(): Double = PI * radius * radius

        override fun perimeter(): Double = 2 * PI * radius

    }
class Rectangle(val width: Double, val height: Double, color: String): Figure(color){
    override fun area(): Double = width * height

    override fun perimeter(): Double = 2 * (width + height)
    }







fun main() {
    val allFigure = listOf<Figure>(
        Circle(5.0, COLOR_BLACK),
        Rectangle(4.0, 6.0, COLOR_WHITE),
        Circle(3.0, COLOR_WHITE),
        Rectangle(2.0, 3.0, COLOR_WHITE),
        Circle(7.0, COLOR_BLACK),
        Rectangle(5.0, 5.0, COLOR_WHITE)
    )

    val blackPerimeters = allFigure
        .filter { it.color == COLOR_BLACK }
        .sumOf { it.area() }

    val whiteAreaSum = allFigure
        .filter { it.color == COLOR_WHITE}
        .sumOf { it.perimeter() }

    println("Результаты")
    println("Сумма периметров черных фигур: ${String.format("%.2f", blackPerimeters)}")
    println("Сумма площадей белых фигур: ${String.format("%.2f", whiteAreaSum)}")
}