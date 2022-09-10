package ru.mephi.java.ch02.sec09;

public class sec09 {
    public static void main(String[] args) {
        Car bmv = new Car(20);

        bmv.fillTank(10);
        bmv.goForward(20);
        System.out.println(bmv.getDistance());
        System.out.println(bmv.getFuelLevel());
    }
}

