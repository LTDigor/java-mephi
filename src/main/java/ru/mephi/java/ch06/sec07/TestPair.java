package ru.mephi.java.ch06.sec07;

import java.util.ArrayList;

public class TestPair {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("123", "1234");

        System.out.println(p.min());
    }
}
