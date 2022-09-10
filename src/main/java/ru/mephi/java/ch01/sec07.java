package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short a = (short) (in.nextInt() + Short.MIN_VALUE);//normalize to short
        short b = (short) (in.nextInt() + Short.MIN_VALUE);


        System.out.println("Sum: " + (a + b - 2 * Short.MIN_VALUE));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + Short.toUnsignedInt((short) (a * b)));
        System.out.println("Quotient: " + Short.toUnsignedInt((short) ((a - Short.MIN_VALUE) / (b - Short.MIN_VALUE))));
        System.out.println("Remainder: " + Short.toUnsignedInt((short) ((a - Short.MIN_VALUE) % (b - Short.MIN_VALUE))));
    }
}
