package ru.mephi.java.ch04.dop;

import ru.mephi.java.ch04.sec01.points.Point;

public class Test {
    public static void main(String[] args) {
        ComparableClassChild o1 = new ComparableClassChild(1, "2",
                new boolean[]{true, false}, new Point(1, 2));

        ComparableClassChild o2 = new ComparableClassChild(1, "2",
                new boolean[]{true, false}, new Point(1, 2));

        ComparableClassChild o3 = new ComparableClassChild(1, "2",
                new boolean[]{true, false}, new Point(2, 2));

        try {
            System.out.println(IsEquals.isEquals(o1, o2));
            System.out.println(IsEquals.isEquals(o1, o3));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
