package ru.mephi.java.ch02.sec15;

import java.util.ArrayList;

public class Invoice {
    public static class Item { // A public nested class
        private String description;
        private int quantity;
        private double unitPrice;
        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }
        public double price() { return quantity * unitPrice; }
        public void print() {
            System.out.printf("%15s\t%10.2f\t%8d\t%11.2f\n", description, unitPrice, quantity, price());
        }
    }
    private ArrayList<Item> items = new ArrayList<>();
    public void add(Item item) { items.add(item); }

    private void printTableColumns(){
        System.out.printf("%15s\t%10s\t%8s\t%11s\n", "Description", "Unit price", "Quantity", "Total price");
    }
    public void print() {
        printTableColumns();
        for(Item item : items) {
            item.print();
        }
    }
}
