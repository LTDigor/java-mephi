package ru.mephi.java.ch04.dop;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class IsEquals {

    public static boolean isEquals(Object obj, Object other) throws IllegalAccessException {
        if (obj == other) return true;
        if (other == null || obj == null) return false;
        if (obj.getClass() != other.getClass()) return false;

        //check item variables
        Class<?> cl = obj.getClass();

        if (cl.isArray()) {
            //compare array len
            int arrayLen = Array.getLength(obj);
            if (arrayLen != Array.getLength(other))
                return false;

            //compare all items in array
            for (int i = 0; i < arrayLen; i++) {
                if (!isEquals(Array.get(obj, i), Array.get(other, i)))
                    return false;
            }

            return true;
        }

        while (cl != null) {
            //get class fields
            Field[] objFields = cl.getDeclaredFields();

            //compare class fields
            for (Field field : objFields) {
                int fieldModifier = field.getModifiers();

                if (Modifier.isStatic(fieldModifier))
                    continue;

                field.setAccessible(true);

                if (!isEquals(field.get(obj), field.get(other)))
                    return false;
            }

            cl = cl.getSuperclass();
        }

        return true;
    }

}