package ru.mephi.java.ch07.sec04;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GetConcurrentModificationException {
    public static void main(String[] args) {
        // for fix: use only one iterator or don't modify List
        List<String> friends = new LinkedList<>();
        ListIterator<String> iter1 = friends.listIterator();
        ListIterator<String> iter2 = friends.listIterator();

        iter1.add("Fred");
        iter1.add("Wilma");

        iter2.add("Den");
    }
}
