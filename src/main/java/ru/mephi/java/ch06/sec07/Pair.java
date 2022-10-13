package ru.mephi.java.ch06.sec07;

public class Pair<E> {
    private final E first;
    private final E second;
    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() { return first; }
    public E getSecond() { return second; }

    @Override
    public String toString() {
        return "first = " + this.getFirst() + " second = " + this.getSecond();
    }
}
