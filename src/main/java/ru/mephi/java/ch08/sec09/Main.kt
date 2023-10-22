package ru.mephi.java.ch08.sec09

import java.io.File
import java.util.regex.Pattern
import java.util.stream.Collectors

fun main() {
    val file = File("src/main/resources/ch08/WarAndPiece.txt")

    val avg = file.inputStream().bufferedReader()
        .lines()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter { it.isNotEmpty() }
        .collect(Collectors.summarizingInt(String::length)).average

    println(avg)
}