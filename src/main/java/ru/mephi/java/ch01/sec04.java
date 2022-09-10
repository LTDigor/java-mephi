package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec04 {
    public static void main(String[] args) {
        double minPosDouble = Math.nextUp(0.0);
        double maxPosDouble = Double.MAX_VALUE;

        System.out.println("Min positive double value: " + minPosDouble);
        System.out.println("Max positive double value: " + maxPosDouble);
    }
}
