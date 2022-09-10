package ru.mephi.java.ch03.dop.Comp;

import java.util.Arrays;

public class MyComparatorTest {
    public static void main(String[] args) {
        String[] strings = new String[] {"+bc", "++", "++++++", "+", "B+++", "b+++", "++c"};

        MyComparator comp1 = new LengthComparator();
        Arrays.sort(strings, comp1);
        for (String s : strings) System.out.println(s);

        System.out.println(1);

        MyComparator comp2 =  comp1.reversed();
        Arrays.sort(strings, comp2);
        for (String s : strings) System.out.println(s);

        System.out.println(2);

        MyComparator comp3 =  comp2.thenComparing(new UpperCaseComparator());
        Arrays.sort(strings, comp3);
        for (String s : strings) System.out.println(s);

        System.out.println();

        System.out.println();

        String[] strings2 = new String[] {"A1", "C00", "c33", "Rfsafsafasffafa", "pfsafsafasffafa"};
        MyComparator comp4 = MyComparator.comparingInt(String::length);
        Arrays.sort(strings2, comp4);
        for (String s : strings2) System.out.println(s);

        System.out.println();

        String[] strings3 = new String[] {"A1", "C00", "c33",  "Psafsafasffafaaaaaa", "Rfsafsafasffafa"};

        MyComparator comp5 = new FirstSym('P');

        Arrays.sort(strings3, comp5);
        for (String s : strings3) System.out.println(s);

        System.out.println();

        String[] strings4 = new String[] {"Rfsafsafasffafa",  "C00", "A1", "c33", "pfsafsafasffafa"};
        MyComparator comp6 = MyComparator.comparingInt(Helper.m::getLength);
        Arrays.sort(strings4, comp6);
        for (String s : strings4) System.out.println(s);

        System.out.println();

    }


}

class LengthComparator implements MyComparator {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() - o2.length() > 0) return 1;
        else if (o1.length() - o2.length() < 0) return -1;
        else return 0;
    }
}

class UpperCaseComparator implements MyComparator {
    @Override
    public int compare(String o1, String o2) {
        char[] charArray1 = o1.toCharArray();
        char[] charArray2 = o2.toCharArray();
        if (Character.isUpperCase(charArray1[0]) && !Character.isUpperCase(charArray2[0])) return 1;
        else if (!Character.isUpperCase(charArray1[0]) && Character.isUpperCase(charArray2[0])) return -1;
        else return 0;
    }
}


class FirstSym implements MyComparator {

    private final char firstSym;

    public FirstSym(char firstSym) {
        this.firstSym = firstSym;
    }

    @Override
    public String toString() {
        return "First symbol is " + firstSym;
    }

    @Override
    public int compare(String o1, String o2) {
        char[] charArray1 = o1.toCharArray();
        char[] charArray2 = o2.toCharArray();
        if (charArray1[0] == firstSym) return 0;
        else if (charArray2[0] == firstSym) return 1;
        else return 0;
    }
}


class Helper {
    public static MeasureComp m = new MeasureComp();

    public String s;

    public Helper(String s) {
        this.s = s;
    }
}

class MeasureComp {
    public Integer getLength(String s) {
        return s.length();
    }
}
