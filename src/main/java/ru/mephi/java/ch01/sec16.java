package ru.mephi.java.ch01;

public class sec16 {
    public static void main(String[] args) {
        double avg = average(4, 6, 9, 10);

        System.out.println(avg);
    }

    public static double average(double firstVal, double... values) {
        double sum = firstVal;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / (values.length + 1);
    }
}
