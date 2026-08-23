package org.example.app

interface Box{
    fun getSurfaceArea(): Double
}

class RectangularBox(val length: Double, val width: Double, val height: Double) : Box {
    override fun getSurfaceArea(): Double {
        return 2 * (length*width + width * height + length * height)
    }
}
class Cube(val side: Double) : Box{
    override fun getSurfaceArea(): Double {
        return 6 * side * side
    }
}
fun main() {

    val boxes: List<Box> = listOf(
        RectangularBox(2.0, 3.0, 4.0),
        Cube(3.0)
    )

    println("=== Площадь поверхности посылок ===")
    boxes.forEach { box ->
        when (box) {
            is RectangularBox -> {
                println("Прямоугольная коробка (${box.length} x ${box.width} x ${box.height}): ${box.getSurfaceArea()}")
            }
            is Cube -> {
                println("Куб (${box.side}): ${box.getSurfaceArea()}")
            }
        }
    }
}