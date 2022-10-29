package ru.mephi.java.ch06.sec22;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        DoWork.doWork(() -> new String(Files.readAllBytes(Path.of(""))), RuntimeException.class);
    }
}
