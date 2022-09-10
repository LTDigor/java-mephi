package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Your number: ");
        int number = in.nextInt();

        System.out.printf("Bin: %s\n", Integer.toString(number, 2));
        System.out.printf("Oct: %#o\n", number);
        System.out.printf("Hex: %#X\n", number);
        System.out.printf("Reciprocal hex floating-point: %A", 1.0 / number);

    }
}
