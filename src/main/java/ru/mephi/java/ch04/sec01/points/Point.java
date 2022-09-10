package ru.mephi.java.ch04.sec01.points;

public class Point {
    protected final double x;
    protected final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;

        if (other == null)
            return false;

        if (getClass() != other.getClass())
            return false;

        Point otherPoint = (Point) other;
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    @Override
    public int hashCode() {
        return Double.hashCode(x) + Double.hashCode(y)*10;
    }
}
