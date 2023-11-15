package ru.mephi.java.ch09.sec10;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDigitsFromStr {
    public static void main(String[] args) {
        String str = "  1  2 3 -12    -345 0 0 3  ";

        System.out.println(parseRegexFind(str));
        System.out.println(parseRegexSplit(str));
    }

    public static @NotNull ArrayList<Integer> parseRegexFind(String str) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);

        ArrayList<Integer> res = new ArrayList<>();

        while (matcher.find()) {
            res.add(Integer.parseInt(matcher.group()));
        }

        return res;
    }

    public static @NotNull ArrayList<Integer> parseRegexSplit(String str) {
        return new ArrayList<>(Arrays.stream(str.trim().split("[^(-?\\d+)]+")).map(Integer::parseInt).toList());
    }
}
