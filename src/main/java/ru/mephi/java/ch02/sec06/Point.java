package ru.mephi.java.ch02.sec06;

/**
 * Mutable class Point  that describes a point in the plane
 */
public class Point {
    private double x, y;

    /**
     * A no-arg constructor to set the point to the origin
     */
    Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * A constructor to set it to a specific point
     *
     * @param x - X-axis coordinate
     * @param y - Y-axis coordinate
     */
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get X-coordinate of the point
     *
     * @return X-coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Get Y-coordinate of the point
     *
     * @return Y-coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * The mutable translate method moves
     * the point by a given amount in x- and y-direction.
     *
     * @param deltaX - addition to the X-coordinate
     * @param deltaY - addition to the Y-coordinate
     * @return a reference to this object
     */
    public Point translate(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;

        return this;
    }

    /**
     * The mutable scale method scales both coordinates by a given factor.
     * Implement these methods so that they return new points with the results.
     *
     * @param scale - scale factor
     * @return a reference to this object
     */
    public Point scale(double scale) {
        x *= scale;
        y *= scale;

        return this;
    }
}
