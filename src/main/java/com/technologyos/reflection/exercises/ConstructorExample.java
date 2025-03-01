package com.technologyos.reflection.exercises;

import com.technologyos.reflection.classes.ServerConfiguration;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorExample {

    public static List<String> printConstructorData(Class<?> clazz){
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        List<String> parameterTypeNames = null;
        System.out.println(String.format("class %s has %d declared constructors", clazz.getSimpleName(), constructors.length));

        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            parameterTypeNames = Arrays.stream(parameterTypes)
                .map(Class::getSimpleName)
                .collect(Collectors.toList());
            System.out.println(parameterTypeNames);
        }
        return parameterTypeNames;
    }

    public static <T> T createInstanceWithArguments(Class<T> clazz, Object ... args) throws InvocationTargetException,
        InstantiationException, IllegalAccessException {
        for(Constructor<?> constructor : clazz.getDeclaredConstructors()){
            if(constructor.getParameterTypes().length == args.length){
                return (T) constructor.newInstance(args);
            }
        }
        System.out.println("An appropriate constructor was not found");
        return null;
    }

    public static void initConfiguration() throws NoSuchMethodException, InvocationTargetException,
        InstantiationException, IllegalAccessException {
        Constructor<ServerConfiguration> constructor =
            ServerConfiguration.class.getDeclaredConstructor(int.class, String.class);

        constructor.setAccessible(true);
        constructor.newInstance(8080, "Good Day!");
    }
}
