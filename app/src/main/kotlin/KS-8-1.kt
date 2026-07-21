package org.example.app



fun main() {

    val views = arrayOf(234, 343, 123, 1024, 345, 567, 654)

    var total = 0
    for (i in views){
        total += i

    }
    println("Всего просмотров за неделю: $total")
}