package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec11 {
    public static void main(String[] args) {
        final int ASCII_LEN = 128;
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int i = 0; i < str.length(); i++){
            char symbol = str.charAt(i);
            if (symbol > ASCII_LEN - 1) {
                System.out.println(symbol + " \\u+" + Integer.toString(symbol, 16));
            }
        }
    }
}
