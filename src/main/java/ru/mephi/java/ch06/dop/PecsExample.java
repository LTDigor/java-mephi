package ru.mephi.java.ch06.dop;

import java.util.*;

public class PecsExample {

    public static void main(String[] args) {
        //PECS examples
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("123", "212345", "2345"));

        //java producers, void -> <T>
        List<Number> nums = Arrays.asList(4.1F, 0.2F);
        List<Integer> ints = Arrays.asList(1,2);
        Collections.copy(nums, ints);

        nums.get(0);

        Map<String, String> map = new HashMap<>();
        map.put("1234", "21323");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.putAll(map);

        //java consumers, <T> -> void
        strings.add(0, "111");
        System.out.println(strings);
        printNumbers(new ArrayList<>(Arrays.asList(1234, 123.34)));
    }

    public static void printNumbers (ArrayList<? extends Number> staff) {
        for (int i = 0; i < staff.size(); i++) {
            Number e = staff.get(i);
            System.out.println(e);
        }
    }
}
