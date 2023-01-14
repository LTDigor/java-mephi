package ru.mephi.java.ch07.dop;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrWrapper {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "12", "123", "12345", "123456", "1234567"));

        ArrayWrapper<String> container0 = new ArrayWrapper<>(list);

        ArrayWrapper<String> container1 = container0.where((str) -> str.length() > 1).where((str) -> str.length() < 6);

        System.out.println(container1);
    }
}
