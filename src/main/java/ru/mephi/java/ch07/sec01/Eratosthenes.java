package ru.mephi.java.ch07.sec01;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratostheneHashSet(final int n) {
        final Set<Integer> set = new HashSet<>(n);
        final Set<Integer> res = new HashSet<>(n);

        for (int i = 2; i <= n; i++) {
            set.add(i);
        }

        for (int s = 2; s*s <= n; s++) {
                for (int forRemove = s*s; forRemove <= n; forRemove += s) {
                    set.remove(forRemove);
                }
        }

        return set;
    }

    public static BitSet eratostheneBitSet(final int n) {
        final BitSet set = new BitSet(n);
        set.set(1, n);

        for (int s = 2; s*s <= n; s++) {
            for (int forRemove = s*s; forRemove <= n; forRemove += s) {
                set.clear(forRemove - 1);
            }
        }

        return set;
    }
}
