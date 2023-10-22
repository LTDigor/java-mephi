package ru.mephi.java.ch08.sec13

import java.util.stream.Stream


fun main() {
    val arr1 = listOf(1, 2)
    val arr2 = listOf(4, 5)
    val arr3 = listOf(6, 7)

    Stream.of(arr1, arr2, arr3).reduce { list1, list2 -> list1 + list2 }.get().forEach(::println)
    println()

    Stream.of(arr1, arr2, arr3).reduce(listOf()) { list1, list2 -> list1 + list2 }.forEach(::println)
    println()


    Stream.of(arr1, arr2, arr3).reduce(listOf<Int>(), { res, element -> res + element })
    { res1, res2 ->
        res1 + res2
    }.forEach(::println)
}