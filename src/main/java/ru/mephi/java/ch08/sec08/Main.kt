package ru.mephi.java.ch08.sec08

import java.io.File
import java.util.regex.Pattern

fun main() {
    val file = File("src/main/resources/ch08/WarAndPiece.txt")

    file.inputStream().bufferedReader()
        .lines()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .parallel()
        .filter { it.isNotEmpty() }
        .filter { it.toSet().size > 12 }
        .distinct()
        .limit(10)
        .forEach(::println)
}