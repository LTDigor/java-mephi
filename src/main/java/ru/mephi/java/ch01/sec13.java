package ru.mephi.java.ch01;

import java.util.ArrayList;
import java.util.Random;

public class sec13 {
    public static void main(String[] args) {
        final int ROLLS_VALUE = 6;
        final int MAX_NUMBER = 49;
        Random generator = new Random();

        ArrayList<Integer> tickets = new ArrayList<>();
        //fill the array
        for (int i = 0; i < MAX_NUMBER; i++) {
            tickets.add(i + 1);
        }

        ArrayList<Integer> combination = new ArrayList<>();
        //calculate the combination
        for (int i = 0; i < ROLLS_VALUE; i++) {
            int ticket_index = generator.nextInt(tickets.size());
            combination.add(tickets.get(ticket_index));
            tickets.remove(ticket_index);
        }

        //show win combination
        for(int item: combination) {
            System.out.print(item + " ");
        }
    }
}
