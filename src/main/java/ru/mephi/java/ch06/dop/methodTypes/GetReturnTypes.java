package ru.mephi.java.ch06.dop.methodTypes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class GetReturnTypes {
    public static <T> ArrayList<Class<?>> getReturnTypes(T obj, String methodName, Class<?>... args) throws NoSuchMethodException {
        //get class of method return type
        Class<?> returnType = obj.getClass().getDeclaredMethod(methodName, args).getReturnType();

        ArrayList<Class<?>> res = new ArrayList<>();

        if (obj.getClass() == Object.class) {
            res.add(returnType);
            return res;
        }

        String packageName = returnType.getPackageName();

        Set<Class<?>> set = getClassesFromPackage(packageName);
        for (Class<?> cl: set) {
            if (returnType.isAssignableFrom(cl)) {
                res.add(cl);
            }
        }

        return res;
    }

    private static Set<Class<?>> getClassesFromPackage(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));

        if (stream == null) {
            return null;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> getClass(line, packageName))
                .collect(Collectors.toSet());

        //Reflections reflections = new Reflections("java.lang", Scanners.SubTypes);
        //return reflections.getSubTypesOf(Object.class);
    }

    private static Class<?> getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            // handle the exception
        }
        return null;
    }


}
