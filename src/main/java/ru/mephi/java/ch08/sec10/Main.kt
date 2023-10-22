package ru.mephi.java.ch08.sec10

import java.io.File
import java.util.regex.Pattern
import java.util.stream.Collectors

fun main() {
    val file = File("src/main/resources/ch08/WarAndPiece.txt")

    val maxLen = file.inputStream().bufferedReader()
        .lines()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter { it.isNotEmpty() }
        .collect(Collectors.summarizingInt(String::length)).max

    file.inputStream().bufferedReader()
        .lines()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter { it.isNotEmpty() }
        .filter { it.length == maxLen }
        .distinct()
        .limit(10)
        .forEach(::println)
}