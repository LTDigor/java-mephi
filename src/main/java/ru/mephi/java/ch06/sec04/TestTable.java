package ru.mephi.java.ch06.sec04;

public class TestTable {
    public static void main(String[] args) throws KeyNotFoundException {
        Table<String, String> table = new Table<>();

        table.put("123", "www");
        table.put("234", "abc");
        table.put("345", "zzz");

        System.out.println(table);

        table.remove("123");
        System.out.println("234" + " " + table.get("234"));
    }
}
