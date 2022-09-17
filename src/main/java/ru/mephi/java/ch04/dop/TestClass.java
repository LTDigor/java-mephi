package ru.mephi.java.ch04.dop;

import ru.mephi.java.ch04.sec01.points.Point;

class ComparableClassParent {
    public int a;
    private String b;

    ComparableClassParent(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class ComparableClassChild extends ComparableClassParent {
    private final Point point;
    public boolean[] c;


    ComparableClassChild(int a, String b, boolean[] c, Point point) {
        super(a, b);
        this.c = c.clone();
        this.point = new Point(point.getX(), point.getY());
    }
}
