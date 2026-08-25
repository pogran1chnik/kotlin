package org.example.app


fun main() {

    val items = listOf<String>("Кнопка", "Иконка", "Текст", "Изображение", "Ссылка")

    val lambdas: List<() -> Unit> = items.map { item ->
        {println("Нажат элемент $item")}
    }
    lambdas.forEachIndexed { index, lambda ->
        if (index % 2 == 0){
            lambda()
        }
    }
}


