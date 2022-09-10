package ru.mephi.java.ch04.sec04;

import ru.mephi.java.ch04.sec01.points.Point;

public class Line extends Shape{
    private final Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = new Point(to.getX(), to.getY());
    }

    @Override
    public Point getCenter() {
        return new Point(
                (point.getX() + to.getX()) / 2,
                (point.getY() + to.getY()) / 2
        );
    }

    @Override
    public Line clone() {
        return new Line(point, to);
    }
}
