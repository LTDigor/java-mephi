package ru.mephi.java.ch06.dop.methodTypes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        TestClass obj = new TestClass();
        String methodName = "testMethod";

        Method m = chooseMethod(obj, methodName);

        //Add parameterTypes args, because method may have generic input and output
        System.out.println(GetReturnTypes.getReturnTypes(obj, m.getName(), m.getParameterTypes()));
    }

    static class TestClass {
        public MySuperClass testMethod() {
            return new MySuperClass();
        }

        public MySuperClass testMethod(int a) {
            return new MySuperClass();
        }
    }

    public static <T> Method chooseMethod(T obj, String methodName) {
        ArrayList<Method> methods = findMethods(obj, methodName);
        if (methods.size() <= 1) {
            return methods.get(0);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Найдено несколько методов, введите номер нужного");
        for (int i = 0; i < methods.size(); i++) {
            System.out.println(i + 1 + " " + methods.get(i).getName() + ": "
                    + Arrays.toString(methods.get(i).getParameterTypes()));
        }

        System.out.print("Введите номер нужного варианта: ");
        int index = in.nextInt() - 1;
        return methods.get(index);
    }

    //получаем все методы с данной сигнатурой
    public static <T> ArrayList<Method> findMethods(T obj, String methodName) {
        ArrayList<Method> res = new ArrayList<>();
        Method[] methods = obj.getClass().getDeclaredMethods();

        for (Method m : methods) {
            if (m.getName().equals(methodName)) {
                res.add(m);
            }
        }
        return res;
    }
}
