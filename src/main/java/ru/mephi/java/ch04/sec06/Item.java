package ru.mephi.java.ch04.sec06;

import java.util.Objects;

public class Item {
    private final String description;
    private final double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object otherObject) {
        // A quick test to see if the objects are identical
        if (this == otherObject) return true;

        // Must return false if the parameter is null
        if (otherObject == null) return false;

        //EDITED IF with instanceof
        // Check that otherObject is an Item
        if (!(otherObject instanceof Item)) return false;

        // ArrayOperationsTest whether the instance variables have identical values
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) && price == other.price;
    }

    @Override
    public int hashCode() {
        return description.hashCode() + Double.hashCode(price);
    }
}
