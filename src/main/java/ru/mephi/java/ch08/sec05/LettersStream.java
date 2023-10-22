package ru.mephi.java.ch08.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LettersStream {
    public static void main(String[] args) {
        System.out.println(lettersOriginal("1234").toList());
        System.out.println(lettersNew("1234").toList());
    }
    public static Stream<String> lettersOriginal(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            result.add(s.substring(i, i + 1));
        return result.stream();
    }

    public static Stream<String> lettersNew(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> s.substring(i, i + 1));
    }
}
