package ru.mephi.java.ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class dop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger num = in.nextBigInteger();

        boolean isFib = isFibonacci(num);
        System.out.println(isFib);
    }

    private static boolean isFibonacci(BigInteger num) {
        BigInteger fibPrev = BigInteger.valueOf(0), fibNext = BigInteger.valueOf(1);
        BigInteger temp;

        while(fibPrev.compareTo(num) <= 0) {
            if (num.equals(fibPrev)) {
                return true;
            }

            temp = fibNext;
            fibNext = fibPrev.add(fibNext);
            fibPrev = temp;
        }

        return false;
    }
}
