package ru.mephi.java.ch07.sec01;

import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratostheneHashSet(final int n) {
        final Set<Integer> set = new HashSet<>();
        final Set<Integer> res = new HashSet<>();

        for (int i = 2; i <= n; i++) {
            set.add(i);
        }

        int s = 2;
        int multiplier;
        while (s*s <= n) {
            multiplier = s;
            res.add(s);
            set.remove(s);
            while (s * multiplier <= n) {
                set.remove(s*multiplier);
                multiplier += 1;
            }

            s = Collections.min(set);
        }

        res.addAll(set);
        return res;
    }

    public static BitSet eratostheneBitSet(final int n) {
        final BitSet set = new BitSet(n);
        set.set(1, n);

        int s = 2;
        int multiplier;
        while (s*s <= n) {
            multiplier = s;

            while (s * multiplier <= n) {
                set.clear(s*multiplier - 1);
                multiplier += 1;
            }

            s = set.nextSetBit(s) + 1;
        }

        return set;
    }
}
