package ru.mephi.java.ch07.sec11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestShuffleWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("1  2 3  4 5 6 7 8  9".split("\\s+")));
        List<String> sublist = words.subList(1, words.size() - 1);

        Collections.shuffle(sublist);

        System.out.println(words);
    }
}
