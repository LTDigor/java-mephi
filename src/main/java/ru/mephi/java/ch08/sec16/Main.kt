package ru.mephi.java.ch08.sec16

import ru.mephi.java.ch08.utils.TimestampPrinter
import java.io.File

fun main() {
    TimestampPrinter.getTime {
        File("src/main/resources/ch08/WarAndPiece.txt")
            .inputStream().bufferedReader()
            .lines()
            .sorted(Comparator.comparing(String::length).reversed())
            .limit(500)
            .forEach(::println)
    }
}