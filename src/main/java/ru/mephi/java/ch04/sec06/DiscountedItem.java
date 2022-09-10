package ru.mephi.java.ch04.sec06;

public class DiscountedItem extends Item {
    private final double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;

        //dont see discount for Item class
        if (otherObject.getClass() == Item.class) return true;

        DiscountedItem other = (DiscountedItem) otherObject;
        return discount == other.discount;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.hashCode(discount);
    }
}
