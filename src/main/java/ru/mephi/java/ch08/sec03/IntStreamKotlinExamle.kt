package ru.mephi.java.ch08.sec03

import java.util.Arrays
import java.util.stream.Stream

fun main() {
    val values = arrayOf(1, 4, 9, 16)
    Stream.of(values).forEach(::println)
    Arrays.stream(values).forEach(::println)
}