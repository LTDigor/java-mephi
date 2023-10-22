package ru.mephi.java.ch08.sec12

import java.util.stream.Stream

fun main() {
    zip(
        Stream.iterate(0) {n -> n + 1}.limit(10),
        Stream.iterate(0) {n -> n - 1}.limit(9)
    ).forEach(::println)
}

fun <T> zip(first: Stream<T>, second: Stream<T>): Stream<T?> {
    val iter1 = first.iterator()
    val iter2 = second.iterator()

    var isFirstTurn = false
    return Stream.iterate(if (iter1.hasNext()) iter1.next()
    else null,
        { iter1.hasNext() || iter2.hasNext() })
    {
        if (isFirstTurn) {
            isFirstTurn = false
            if (iter1.hasNext()) iter1.next()
            else null
        } else {
            isFirstTurn = true
            if (iter2.hasNext()) iter2.next()
            else null
        }
    }
}