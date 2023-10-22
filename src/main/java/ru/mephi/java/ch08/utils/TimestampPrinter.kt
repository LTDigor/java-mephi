package ru.mephi.java.ch08.utils

object TimestampPrinter {
    fun getTime(block: () -> Any?) {
        val start = System.currentTimeMillis()
        block.invoke()
        val end = System.currentTimeMillis()
        println(end - start)

    }
}