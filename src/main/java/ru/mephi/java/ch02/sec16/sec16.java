package ru.mephi.java.ch02.sec16;

public class sec16 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 3; i++) {
            queue.add(String.valueOf(i));
        }

        for (int i = 0; i < 4; i++) {
            queue.print();
            queue.remove();
        }

        for (int i = 0; i < 2; i++) {
            queue.add(String.valueOf(i));
        }
        Queue.Iterator iterator = queue.new Iterator();
        iterator.next();
        while (iterator.hasNext()) {
            System.out.println(iterator.remove());
        }
        queue.print();

    }
}

