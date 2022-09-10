package ru.mephi.java.ch04.sec04;

import ru.mephi.java.ch04.sec01.points.Point;

public class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() - height / 2);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(point, width, height);
    }
}
