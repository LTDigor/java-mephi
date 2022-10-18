package ru.mephi.java.ch06.sec20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repeater {
    @SafeVarargs public static <T> T[] repeat(int n, T... objs) {
        T[] res = Arrays.copyOf(objs, n*objs.length);

        for (int objNumber = 0; objNumber < objs.length; objNumber++) {
            for (int copyNumber = 0; copyNumber < n; copyNumber++) {
                res[objNumber*n + copyNumber] = objs[objNumber];
            }
        }

        return res;
    }
}
