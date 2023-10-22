package ru.mephi.java.ch08.sec04

import java.math.BigInteger
import java.util.stream.Stream
import kotlin.math.pow

object LinearCongruentialGenerator {

    fun createStream(ratio: Long, freeMember: Long, mod: Long, seed: Long): Stream<Long> {
        return Stream.iterate(seed) {
            x ->
            BigInteger.valueOf(ratio)
                .multiply(BigInteger.valueOf(x))
                .add(BigInteger.valueOf(freeMember))
                .mod(BigInteger.valueOf(mod))
                .toLong()
        }
    }
}

fun main() {
    LinearCongruentialGenerator
        .createStream(25214903917, 11, 2.0.pow(48).toLong(), 0)
        .limit(50)
        .forEach(::println)
}