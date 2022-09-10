package ru.mephi.java.ch04.sec04;

import ru.mephi.java.ch04.sec01.points.Point;

public class Circle extends Shape{
    private final double radius;

    public Circle(Point center, double radius) {
        super(center);

        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX(), point.getY());
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Circle clone() {
        return new Circle(point, radius);
    }
}
