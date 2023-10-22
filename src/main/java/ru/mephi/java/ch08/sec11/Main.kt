package ru.mephi.java.ch08.sec11

import java.util.stream.Stream

fun main() {
    println(isFinite(Stream.iterate(0) { n -> n + 1 }.limit(5)))
    println(isFinite(Stream.iterate(0) { n -> n + 1 }))
}

fun <T> isFinite(stream: Stream<T>): Boolean {
    val limit = 100L
    return stream.limit(limit + 1).count() <= limit
}