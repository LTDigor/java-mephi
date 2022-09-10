package ru.mephi.java.ch04.sec07;

public enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    WHITE(255, 255, 255),
    CYAN(0, 255, 255),
    YELLOW(255, 255, 0),
    MAGENTA(255, 0, 255);

    private final int red;
    private final int green;
    private final int blue;

    Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}
