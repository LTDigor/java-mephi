package ru.mephi.java.ch06.sec05;

import java.util.Arrays;

public class Test {
    static class Swapper{
        @SafeVarargs
        public static <T> T[] swap(int i, int j, T... values) {
            T temp = values[i];
            values[i] = values[j];
            values[j] = temp;
            return values;
        }
    }

    public static void main(String[] args) {
        //Incompatible types. Found: 'java.lang.Number & java.lang.Comparable<? extends java.lang.Number & java.lang.Comparable<?> & java.lang.constant.Constable & java.lang.constant.ConstantDesc> & java.lang.constant.Constable & java.lang.constant.ConstantDesc[]', required: 'java.lang.Double[]'
        //Double[] result1 = Swapper.swap(0, 1, 1.5, 2, 3);

        //'swap(int, int, java.lang.Double...)' cannot be applied to '(int, int, double, int, int)'
        //Double[] result2 = Swapper.<Double>swap(0, 1, 1.5, 2, 3);

        Double[] result3 = Swapper.<Double>swap(0, 1, 1.5, 2.0, 3.0);
        System.out.println(Arrays.toString(result3));
    }
}
