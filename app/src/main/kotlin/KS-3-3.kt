package org.example.app


fun main() {
    val name = 6
    val latter = """
        $name * 1 = ${name * 1}
        $name * 2 = ${name * 2}
        $name * 3 = ${name * 3}
        $name * 4 = ${name * 4}
        $name * 5 = ${name * 5}
        $name * 6 = ${name * 6}
        $name * 7 = ${name * 7}
        $name * 8 = ${name * 8}
        $name * 9 = ${name * 9}
        """.trimIndent()
    println(latter)
}

