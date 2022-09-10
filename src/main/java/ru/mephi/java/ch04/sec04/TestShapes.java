package ru.mephi.java.ch04.sec04;

import ru.mephi.java.ch04.sec01.points.Point;

public class TestShapes {
    public static void main(String[] args) {
        Point point = new Point(1.1, 2.0);

        Shape circle = new Circle(point, 2.0);
        System.out.println("Circle center: " + circle.getCenter());
        System.out.println("Cloned circle center: " + circle.clone().getCenter());
        System.out.println();

        Shape rectangle = new Rectangle(point, 2.0, 4.0);
        System.out.println("Rectangle center: " + rectangle.getCenter());
        System.out.println("Cloned rectangle center: " + rectangle.clone().getCenter());
        System.out.println();

        Point to = new Point(3.56, 6.0);
        Shape line = new Line(point, to);
        System.out.println("Line center: " + line.getCenter());
        System.out.println("Cloned line center: " + line.clone().getCenter());
    }
}
