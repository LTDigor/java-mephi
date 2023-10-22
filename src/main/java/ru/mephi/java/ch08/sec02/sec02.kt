package ru.mephi.java.ch08.sec02


import ru.mephi.java.ch08.utils.TimestampPrinter
import java.io.File
import java.util.regex.Pattern

fun main() {
    val wordLen = 12

    TimestampPrinter.getTime {
        val serialStreamRes = File("src/main/resources/ch08/WarAndPiece.txt")
            .inputStream().bufferedReader()
            .lines()
            .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
            .filter { it.length >= wordLen }.count()

        println(serialStreamRes)
    }

    // see boost only in War and Piece x5 volume
    TimestampPrinter.getTime {
        val parallelStreamRes = File("src/main/resources/ch08/WarAndPiece.txt")
            .inputStream().bufferedReader()
            .lines()
            .parallel()
            .flatMap { Pattern.compile("\\PL+").splitAsStream(it) }
            .filter { it.length >= wordLen }.count()
        println(parallelStreamRes)
    }
}