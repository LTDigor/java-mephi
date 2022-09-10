package ru.mephi.java.ch02.sec10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int randIndex = nextInt(0, numbers.length - 1);
        return numbers[randIndex];
    }

    public static int randomElement(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        }

        int randomIndex = nextInt(0, numbers.size() - 1);
        return numbers.get(randomIndex);
    }
}
