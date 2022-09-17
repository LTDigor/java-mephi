package ru.mephi.java.ch04.dop;

import ru.mephi.java.ch04.sec01.points.Point;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ComparableClassChild o1 = new ComparableClassChild(1, "2",
                new boolean[]{true, false}, new Point(1, 2));

        ComparableClassChild o2 = new ComparableClassChild(1, "2",
                new boolean[]{true, false}, new Point(1, 2));

        ComparableClassChild o3 = new ComparableClassChild(1, "2",
                new boolean[]{true, false}, new Point(2, 2));

        ComparableClassChild o4 = new ComparableClassChild(1, "2",
                new boolean[]{true, true}, new Point(1, 2));

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 4};
        int[] c = new int[]{1, 2, 3};
        try {
            System.out.println(IsEquals.isEquals(a, b));
            System.out.println(IsEquals.isEquals(a, c));
            System.out.println(IsEquals.isEquals(o1, o2));
            System.out.println(IsEquals.isEquals(o1, o3));
            System.out.println(IsEquals.isEquals(o1, o4));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
