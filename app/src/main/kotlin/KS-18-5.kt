package org.example.app

class Screen{
    fun drawCircle(x: Int, y: Int, radius: Int): String{
        return "Нарисован круг в ($x, $y) с радиусом $radius"
    }
    fun drawCircle(x: Float, y: Float, radius: Float): String{
        return "Нарисован круг в ($x, $y) с радиусом $radius"
    }
    fun drawSquare(x: Int, y: Int, size: Int): String{
        return "Нарисован квадрат в ($x, $y) со стороной $size"
    }
    fun drawSquare(x: Float, y: Float, size: Float): String{
        return "Нарисован квадрат в ($x, $y) со стороной $size"
    }
    fun drawPoint(x: Int, y: Int): String{
        return "Нарисована точка в ($x, $y)"
    }
    fun drawPoint(x: Float, y: Float): String{
        return "Нарисована точка в ($x, $y)"
    }


}
fun main() {

    val screen = Screen()
    println("=== Рисование фигур ===")
    println()


    println(screen.drawCircle(5, 10, 3))
    println(screen.drawCircle(2.5f, 3.5f, 4.5f))
    println()


    println(screen.drawSquare(1, 2, 5))
    println(screen.drawSquare(2.5f, 3.5f, 4.0f))
    println()


    println(screen.drawPoint(7, 8))
    println(screen.drawPoint(1.5f, 2.5f))



}