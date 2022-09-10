package ru.mephi.java.ch03.sec15;

import java.util.Random;

public interface IntSequence {
    default boolean hasNext() { return true; }
    // By default, sequences are infinite
    int next();

    static IntSequence of(int... sequence) {

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

    static IntSequence constant(int number) {
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

    class RandomSequence implements IntSequence {
        final Random generator = new Random();
        int high;
        int low;

        public RandomSequence(int low, int high) {
            this.high = high;
            this.low = low;
        }

        public int next() {
            return low + generator.nextInt(high - low + 1);
        }
    }
}
