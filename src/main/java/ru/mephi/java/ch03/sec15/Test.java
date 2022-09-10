package ru.mephi.java.ch03.sec15;

public class Test {
    public static void main(String[] args) {
        IntSequence randSeq = new IntSequence.RandomSequence(1, 100);
        for (int i = 0; i < 10; i++) {
            System.out.println(randSeq.next());
        }
    }
}
