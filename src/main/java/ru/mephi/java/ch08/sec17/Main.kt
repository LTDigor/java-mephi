package ru.mephi.java.ch08.sec17

import kotlin.random.Random

fun main() {
    val arr = generateSequence { Random.nextInt(0, 6) }.take(20).toList()
    println(arr)

    // don't work with parallel!
    repeat(5) {
        var prev = -1
        println(arr.stream().parallel().filter {
            val tmp = prev
            prev = it
            it != tmp
        }.toList())
    }
}