package ru.mephi.java.ch07.sec01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        final int n = 25;

        // with hashSet
        final Set<Integer> setHash = Eratosthenes.eratostheneHashSet(n);
        final List<Integer> resHash = new ArrayList<>(setHash);
        Collections.sort(resHash);

        System.out.println(resHash);

        // with BitSet
        final BitSet setBit = Eratosthenes.eratostheneBitSet(n);
        final List<Integer> resBit = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (setBit.get(i)) {
                resBit.add(i + 1);
            }
        }
        System.out.println(resBit);
    }
}
