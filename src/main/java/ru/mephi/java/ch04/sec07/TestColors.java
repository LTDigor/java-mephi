package ru.mephi.java.ch04.sec07;

public class TestColors {
    public static void main(String[] args) {
        for(Color color: Color.values()) {
            System.out.printf(
                    "%s red=%d, green=%d, blue=%d%n",
                    color, color.getRed(), color.getGreen(), color.getBlue()
            );
        }
    }
}
