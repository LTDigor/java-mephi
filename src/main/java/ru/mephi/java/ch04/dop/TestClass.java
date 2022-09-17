package ru.mephi.java.ch04.dop;

import ru.mephi.java.ch04.sec01.points.Point;

class ComparableClassParent {
    private final int a;
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

class A {
    public String s;
    public B b;

    public A(B b, String s) {
        this.b = b;
        this.s = s;
    }

    public A() {

    }
}

class B {
    public String s = "";
    public A a;

    public B(A a, String s) {
        this.a = a;
        this.s = s;
    }

    public B() {

    }
}
