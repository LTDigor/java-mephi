package ru.mephi.java.ch06.sec04;

import java.util.ArrayList;

public class Table <K, V>{
    private static final int KEY_NOT_FOUND = -1;
    private final ArrayList<Entry> arr = new ArrayList<>();

    private int keyIndex(K key) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getKey() == key)
                return i;
        }

        return KEY_NOT_FOUND;
    }

    public void put(K key, V val) {
        int itemIndex = keyIndex(key);

        if (itemIndex == KEY_NOT_FOUND) {
            arr.add(new Entry(key, val));
        }
        else {
            arr.set(itemIndex, new Entry(key, val));
        }
    }

    public V get(K key) throws KeyNotFoundException {
        int itemIndex = keyIndex(key);
        try {
            return arr.get(itemIndex).getValue();
        }
        catch (IndexOutOfBoundsException e) {
            throw new KeyNotFoundException("Key not found", e);
        }
    }

    public V remove(K key) throws KeyNotFoundException {
        int itemIndex = keyIndex(key);
        try {
            return arr.remove(itemIndex).getValue();
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            throw new KeyNotFoundException("Key not found", e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry: arr) {
            sb.append(entry).append("\n");
        }

        return sb.toString();
    }

    //Entry is not a generic class!!!
    class Entry {
        final K key;
        final V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() { return key; }
        public V getValue() { return value; }

        @Override
        public String toString() {
            return "key = " + this.getKey() + " value = " + this.getValue();
        }
    }
}
