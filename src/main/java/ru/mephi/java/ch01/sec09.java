package ru.mephi.java.ch01;

public class sec09 {
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println("With equals: " + ("abcd".equals(str)));

        str = str + "";
        System.out.println("With addition an empty string: " + (str == "abcd"));
    }
}
