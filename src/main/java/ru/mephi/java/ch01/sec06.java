package ru.mephi.java.ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class sec06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 0; i < n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i + 1));
        }

        System.out.println(factorial);
    }


}
