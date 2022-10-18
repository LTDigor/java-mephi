package ru.mephi.java.ch06.sec20;

import java.util.Arrays;

public class TestRepeater {
    public static void main(String[] args) {
        String[] strings = {"1234", "eewr3r23", "5567yuhjk"};

        String[] res = Repeater.repeat(3, strings);
        System.out.println(Arrays.toString(res));
    }
}
