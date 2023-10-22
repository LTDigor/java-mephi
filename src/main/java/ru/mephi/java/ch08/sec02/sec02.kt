package ru.mephi.java.ch08.sec02


import java.io.File
import java.util.regex.Pattern

fun main() {
    val wordLen = 12

    val startSerial = System.currentTimeMillis()
    val serialStreamRes = File("src/main/resources/ch08/WarAndPiece.txt")
        .inputStream().bufferedReader()
        .lines()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter { it.length >= wordLen }.count()
    val endSerial = System.currentTimeMillis()

    println(serialStreamRes)
    println("Serial: ${endSerial - startSerial}")
    println()

    // see boost only in War and Piece x5 volume
    val startParallel = System.currentTimeMillis()
    val parallelStreamRes = File("src/main/resources/ch08/WarAndPiece.txt")
        .inputStream().bufferedReader()
        .lines()
        .parallel()
        .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
        .filter { it.length >= wordLen }.count()
    val endParallel = System.currentTimeMillis()

    println(parallelStreamRes)
    println("Serial: ${endParallel - startParallel}")

}