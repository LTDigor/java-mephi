package ru.mephi.java.ch02.sec16;

public class Queue {
    private Node first = null, last = null;
    private int size = 0;
    private static class Node {
        private String data;
        private Node prev = null, next = null;

        Node (String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void add(String data) {
        Node newNode = new Node(data, last, null);
        if (size == 0) {
            first = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
        size += 1;
    }

    public void remove() {
        if (size > 0) {
            first = first.next;
            if (size > 1) {
                first.prev = null;
            }
            size -= 1;
        }
    }

    public void print() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        else {
            Node currentNode = first;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }

    public class Iterator {
        private Node currentNode = first;
        private int nodeNum = 0;

        public boolean hasNext() {
            return currentNode != null;
        }

        public String next() {
            String data = currentNode.data;
            currentNode = currentNode.next;
            nodeNum += 1;
            return data;
        }

        public String remove() {
            String data = currentNode.data;
            //first node
            if (nodeNum == 0) {
                currentNode = currentNode.next;
                if (size > 1) {
                    currentNode.prev = null;
                }
            }
            else {
                currentNode.prev.next = currentNode.next;
                //last node
                if (nodeNum + 1 < size) {
                    currentNode.next.prev = currentNode.prev;
                }
                currentNode = currentNode.next;
            }
            size -= 1;

            return data;
        }
    }
}
