package ru.mephi.java.ch03.sec01;

import java.util.Arrays;

public interface Measurable {
    double getMeasure();

    static double average(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }

        double sum = 0;
        for (Measurable item : objects) {
            sum += item.getMeasure();
        }
        return sum / objects.length;
    }

    static double largest(Measurable[] objects) {
        double res = objects[0].getMeasure();

        for (Measurable item : objects) {
            if (res < item.getMeasure()) {
                res = item.getMeasure();
            }
        }

        return res;
    }
}
