package ru.mephi.java.ch04.sec06;

public class TestEqualsInstanceOf {
    public static void main(String[] args) {
        DiscountedItem discountedItem = new DiscountedItem("MyItem", 100.0, 20);
        Item item = new Item("MyItem", 100.0);

        //equals is symmetric
        System.out.println("discountedItem.equals(item): " + discountedItem.equals(item));
        System.out.println("item.equals(discountedItem): " + item.equals(discountedItem));
        System.out.println();

        //but not transitive, x equals y, y equals z, but x not equals z
        DiscountedItem discountedItem1 = new DiscountedItem("MyItem", 100.0, 30);
        System.out.println("item.equals(discountedItem1): " + item.equals(discountedItem1));
        System.out.println("discountedItem.equals(discountedItem1): " + discountedItem.equals(discountedItem1));

    }
}
