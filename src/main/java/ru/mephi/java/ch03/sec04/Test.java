package ru.mephi.java.ch03.sec04;

public class Test {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 5, 7, 8);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }

        IntSequence constSequence = IntSequence.constant(2);
        for (int i = 0; i < 5; i++) {
            System.out.println(constSequence.next());
        }

        IntSequence constLambdaSequence = IntSequence.constantLambda(3);
        for (int i = 0; i < 5; i++) {
            System.out.println(constLambdaSequence.next());
        }
    }

}
