package org.example.app

class Folder(name: String, fileCount: Int, isSecret: Boolean){
    private var _name: String = name
    private var _fileCount: Int = fileCount
    val isSecret: Boolean = isSecret

    val name: String
        get() = if (isSecret) "скрытая папка" else _name
    val fileCount: Int
        get() = if (isSecret) 0 else _fileCount
    fun printRealInfo() {
        println("Реальное имя: $_name")
        println("Реальное количество файлов: $_fileCount")
    }

}

fun main() {


    val folder = Folder("Важные документы", 15, true)

    println("=== Создание скрытой папки ===")
    println("Папка создана с именем 'Важные документы' и 15 файлами")
    println()

    println("=== Чтение данных ===")
    println("Имя: ${folder.name}")
    println("Количество файлов: ${folder.fileCount}")
    println()

    println("=== Проверка реальных данных ===")
    folder.printRealInfo()
}