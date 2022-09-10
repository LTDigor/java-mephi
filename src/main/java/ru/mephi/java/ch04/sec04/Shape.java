package ru.mephi.java.ch04.sec04;

import ru.mephi.java.ch04.sec01.points.Point;

public abstract class Shape implements Cloneable{
    protected Point point;

    public Shape(Point point) {
        this.point = new Point(point.getX(), point.getY());
    }

    public void moveBy(double dx, double dy) {
        this.point = new Point(this.point.getX() + dx, this.point.getY() + dy);
    }

    public abstract Point getCenter();
    public abstract Shape clone();
}
