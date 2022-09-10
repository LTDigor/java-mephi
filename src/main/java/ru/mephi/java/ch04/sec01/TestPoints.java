package ru.mephi.java.ch04.sec01;

import ru.mephi.java.ch04.sec01.points.LabeledPoint;
import ru.mephi.java.ch04.sec01.points.Point;

public class TestPoints {
    public static void main(String[] args) {
        Point a = new Point(1.2, 1.4);
        Point b = new Point(1.2, 1.4);

        System.out.println(a);
        System.out.println("a == b: " + a.equals(b));
        System.out.println("a.hashCode: " + a.hashCode());
        System.out.println("b.hashCode: " + b.hashCode());

        LabeledPoint aLabeled = new LabeledPoint("labeled", 1.2, 1.5);
        System.out.println(aLabeled);
        System.out.println("aLabeled.hashCode: " + aLabeled.hashCode());
        //error, x is protected
        //System.out.println(aLabeled.x);
    }
}
