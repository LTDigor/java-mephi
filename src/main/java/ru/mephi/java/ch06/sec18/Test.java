package ru.mephi.java.ch06.sec18;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // not ok because of primitive type
//         int[] b = Repeat.repeat(10, 42, int[]::new);
//         System.out.println(Arrays.toString(b));

        Integer[] a = Repeat.repeat(10, 42, Integer[]::new); // ok!
        System.out.println(Arrays.toString(a));
    }
}
