package ru.mephi.java.ch04.sec01.points;

import java.util.Objects;

public class LabeledPoint extends Point {
    private final String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " label = " + label;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other))
            return false;

        LabeledPoint otherPoint = (LabeledPoint) other;
        return Objects.equals(label, otherPoint.getLabel());
    }

    @Override
    public int hashCode() {
        return Double.hashCode(x) + Double.hashCode(y)*10 + label.hashCode()*100;
    }
}
