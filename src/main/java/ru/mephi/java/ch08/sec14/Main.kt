package ru.mephi.java.ch08.sec14

import java.util.stream.Stream

fun main() {
    val avg = Stream.of(1.0, 2.0, 3.0, 4.0).mapToDouble{i -> i}.average().orElse(0.0)
    println(avg)
}