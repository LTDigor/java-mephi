//package ru.mephi.java.ch02;
//
//import org.omg.CORBA.CharHolder;
//import org.omg.CORBA.DoubleHolder;
//import org.omg.CORBA.IntHolder;
//
//public class sec04 {
//    public static void main(String[] args) {
//        //Doesn't work
//        int aInt = 1, bInt = 2;
//        swapInt(aInt, bInt);
//        System.out.println(aInt + " " + bInt);
//
//        //Doesn't work
//        Integer aInteger = 1, bInteger = 2;
//        swapInteger(aInteger, bInteger);
//        System.out.println(aInteger + " " + bInteger);
//
//        //Work because of references
//        IntHolder aIntHolder = new IntHolder(1);
//        IntHolder bIntHolder = new IntHolder(2);
//        swapIntHolder(aIntHolder, bIntHolder);
//        System.out.println(aIntHolder.value + " " + bIntHolder.value);
//
//        DoubleHolder d = new DoubleHolder(4.0);
//        CharHolder c = new CharHolder('c');
//    }
//
//    public static void swapInt(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
//
//    public static void swapInteger(Integer a, Integer b) {
//        Integer temp = a;
//        a = b;
//        b = temp;
//    }
//
//    public static void swapIntHolder(IntHolder a, IntHolder b) {
//        int temp = a.value;
//        a.value = b.value;
//        b.value = temp;
//    }
//}
