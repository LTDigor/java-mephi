package ru.mephi.java.ch08.sec01

fun main() {
    val words = listOf("123", "1234", "234", "2345", "234", "234", "234")
    val longWords = words.stream().filter {
        println("Echo")
        it.length > 2
    }.limit(4).toList()

    println(longWords)
}