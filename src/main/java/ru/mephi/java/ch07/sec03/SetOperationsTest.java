package ru.mephi.java.ch07.sec03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> s1 =  new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 =  new HashSet<>(Arrays.asList(3, 4, 5));

        // union
        Set<Integer> sUnion = new HashSet<>(s1);
        sUnion.addAll(s2);
        System.out.println(sUnion);

        // intersection
        Set<Integer> sIntersection = new HashSet<>(s1);
        sIntersection.retainAll(s2);
        System.out.println(sIntersection);

        // difference (s1 / s2)
        Set<Integer> sDiff = new HashSet<>(s1);
        sDiff.removeAll(s2);
        System.out.println(sDiff);


    }
}
