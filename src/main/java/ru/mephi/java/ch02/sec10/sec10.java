package ru.mephi.java.ch02.sec10;

import java.util.ArrayList;
import java.util.Arrays;

public class sec10 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14));

        int randomNumberArray = RandomNumbers.randomElement(a);
        System.out.println(randomNumberArray);

        int randomNumberArrayList = RandomNumbers.randomElement(b);
        System.out.println(randomNumberArrayList);
    }
}

