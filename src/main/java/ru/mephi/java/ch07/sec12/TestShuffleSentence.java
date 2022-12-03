package ru.mephi.java.ch07.sec12;

public class TestShuffleSentence {
    public static void main(String[] args) {
        String s1 = " A  b c d e f.  ";
        System.out.println(ShuffleSentence.shuffleSentence(s1));

        String s2 = " a.";
        System.out.println(ShuffleSentence.shuffleSentence(s2));
    }
}
