package ru.mephi.java.ch01;

import java.util.Random;

public class sec10 {
    public static void main(String[] args) {
        final int RADIX = 36;
        Random generator = new Random();
        long number = Math.abs(generator.nextLong());

        String str = Long.toString(number, RADIX);
        System.out.println(str);
    }
}
