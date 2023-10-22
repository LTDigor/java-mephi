package ru.mephi.java.ch08.sec03;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        int[] values = {1, 4, 9, 16};

        Stream.of(values).forEach(System.out::println);
        Arrays.stream(values).forEach(System.out::println);
    }
}
