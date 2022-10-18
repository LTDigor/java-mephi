package ru.mephi.java.ch06.sec07;

import java.util.ArrayList;

public class TestFirstLast {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);

        System.out.println(Arrays.firstLast(a));
    }
}
