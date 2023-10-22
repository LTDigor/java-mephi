package ru.mephi.java.ch08.sec15

import ru.mephi.java.ch08.utils.TimestampPrinter
import java.math.BigInteger
import java.util.stream.Stream

fun main() {
    TimestampPrinter.getTime {
        Stream.iterate(BigInteger.valueOf(10).pow(49),
            { n -> n < BigInteger.valueOf(10).pow(50) }
        )
        { n -> n.add(BigInteger.ONE) }
            .parallel()
            .filter { it.isProbablePrime(1) }
            .limit(5000)
            .toList()
            .forEach(::println)
    }
}