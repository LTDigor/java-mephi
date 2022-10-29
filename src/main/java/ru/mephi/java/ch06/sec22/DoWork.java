package ru.mephi.java.ch06.sec22;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

public class DoWork {
    public static <V, T extends Throwable> V doWork(Callable<V> c, Class<T> exClass) throws T, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        try {
            return c.call();
        } catch (Throwable realEx) {
            T ex = exClass.getConstructor().newInstance();
            ex.initCause(realEx);
            throw ex;
        }
    }
}
