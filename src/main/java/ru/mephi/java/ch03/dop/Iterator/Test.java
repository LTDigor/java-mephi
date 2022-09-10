package ru.mephi.java.ch03.dop.Iterator;

import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> strList = List.of("1","22","33","","323");
        Iterator<String> iter = strList.iterator();
        MyIterator<String> myIterator = new MyIterator<>(iter);
        myIterator.fromIterator(iter);

        myIterator.forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++");
        iter = strList.iterator();
        MyIterator<String> newIter = new MyIterator<>(iter);

        newIter.filter(x-> x.equals("1")).forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++");
        iter = strList.iterator();
        MyIterator<String> newIter2 = newIter.fromIterator(iter);

        newIter2.filter(x-> x.length()>1);

        while (newIter2.hasNext()){
            System.out.println(newIter2.next());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++\n\n");

        List<String> strList2 = List.of("123", "aaa", "bbb");
        Iterator<String> iter2 = strList2.iterator();
        MyIterator<String> myIterator2 = new MyIterator<>(iter2);

        List<String> strList3 = List.of("444", "455", "666");
        Iterator<String> iter3 = strList3.iterator();
        MyIterator<String> myIterator3 = new MyIterator<>(iter3);

        MyIterator<String> unionIter = myIterator3.union(myIterator2);

        unionIter.forEach(System.out::println);
    }
}
