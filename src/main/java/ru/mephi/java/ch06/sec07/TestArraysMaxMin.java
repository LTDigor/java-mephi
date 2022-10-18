package ru.mephi.java.ch06.sec07;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArraysMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Max: " + ru.mephi.java.ch06.sec07.Arrays.max(arrayList));
        System.out.println("Min: " + ru.mephi.java.ch06.sec07.Arrays.min(arrayList));
    }
}
