package ru.mephi.java.ch03.sec06;

public class Test {
    public static void main(String[] args) {
        DigitSequence digitSequence = new DigitSequence();

        digitSequence.remove();
        digitSequence.forEachRemaining(System.out::println);
    }
}
