package org.example.app

class RegularBook(
    val title: String,
    val author: String
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {

    val regular1 = RegularBook("dima", "red")
    val regular2 = RegularBook("dima", "red")
    val data1 = DataBook("12", "32")
    val data2 = DataBook("12", "32")
    println(regular1 == regular2)
    println(data1 == data2)

    /*
 Объяснение разницы:
 RegularBook — это обычный класс. Он не переопределяет метод equals().
 При сравнении regular1 == regular2 сравниваются ссылки на объекты.
 Это два разных объекта в памяти, поэтому результат false.

 DataBook — это data class. Kotlin автоматически генерирует для него
 методы equals(), hashCode() и toString(). Метод equals() сравнивает
 все свойства объектов. Так как свойства data1 и data2 одинаковые,
 результат сравнения true.
 */
}