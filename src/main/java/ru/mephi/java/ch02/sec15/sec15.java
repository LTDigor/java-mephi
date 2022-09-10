package ru.mephi.java.ch02.sec15;

public class sec15 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.add(new Invoice.Item("Soap", 2, 50));
        invoice.add(new Invoice.Item("Chocolate", 30, 90));

        invoice.print();
    }
}
