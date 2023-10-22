package ru.mephi.java.ch08.sec06

import java.io.File
import java.util.regex.Pattern
import java.util.stream.Collectors
import kotlin.math.sign

fun main() {
    val file = File("src/main/resources/ch08/WarAndPiece.txt")

    file.inputStream().bufferedReader()
        .lines()
        .parallel()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter{ it.isNotEmpty() }
        .limit(100)
        .forEach(::println)


    file.inputStream().bufferedReader()
        .lines()
        .parallel()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter{ it.isNotEmpty() }
        .collect(Collectors.groupingBy({it}, Collectors.counting()))
        .entries.stream().sorted { e1, e2 ->  (e2.value - e1.value).sign}
        .limit(10).forEach(::println)
}