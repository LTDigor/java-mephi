package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angle: ");
        final int MAX_ANGLE = 360;
        int angle = in.nextInt();

        int normAngle = ((angle % MAX_ANGLE) + MAX_ANGLE) % MAX_ANGLE;
        int normAngleFloorMod = Math.floorMod(angle, MAX_ANGLE);

        System.out.println("With % operator: " + normAngle);
        System.out.println("With floorMod: " +normAngleFloorMod);
    }
}
