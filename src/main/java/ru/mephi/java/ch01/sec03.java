package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int maxNumberIf = number1;
        if (maxNumberIf < number2) {
            maxNumberIf = number2;
        }
        if (maxNumberIf < number3 ) {
            maxNumberIf = number3;
        }

        int maxNumber = Math.max(Math.max(number1, number2), number3);

        System.out.println("Max number with if: " + maxNumberIf);
        System.out.println("Max number with Math.max(): " + maxNumber);
    }
}
