package ru.mephi.java.ch03.sec04;

import java.util.ArrayList;
import java.util.Arrays;

public interface IntSequence {
    // By default, sequences are infinite
    public default boolean hasNext() { return true; }
    public int next();

    public static IntSequence of(int... sequence) {

        return new IntSequence() {
            private int index = 0;

            @Override
            public int next() {
                index += 1;
                return sequence[index - 1];
            }

            @Override
            public boolean hasNext() {
                return index < sequence.length;
            }
        };
    }

    public static IntSequence constant(int number) {
        return new IntSequence() {
            @Override
            public int next() {
                return number;
            }
        };
    }

    public static IntSequence constantLambda(int number) {
        return () -> number;
    }
}
