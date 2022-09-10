package ru.mephi.java.ch02.sec06;

public class sec06 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p1.getX() + " " +  p1.getY());

        Point p2 = new Point();
        System.out.println(p2.getX() + " " + p2.getY());
    }
}

