package com.technologyos.reflection.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * In this exercise we will use Recursion and Java Reflection to solve the problem of "Finding all Implemented Interfaces of a class".
 *
 * Example:
 *
 * (B, C, D, E, F, G are interfaces)
 *
 *
 * The class A implements the interfaces B, C and D.
 *
 * However because:
 *
 * Interface B extends E
 *
 * Interface C extends F
 *
 * Interface D extends F and G
 *
 * "All the implemented interfaces of the class A" are:
 *
 * {B, C, D, E, F, G}
 */
public class ImplementedInterface {
    /**
     * Returns all the interfaces that the current input class implements
     * Note: If the input is an interface, the method returns all the interfaces the
     * input interfaces extends
     */
    public static Set<Class<?>> findAllImplementedInterfaces(Class<?> input) {
        Set<Class<?>> allImplementedInterfaces = new HashSet<>();

        Class<?>[] inputInterfaces = input.getInterfaces();
        for (Class<?> currentInterface : inputInterfaces) {
            allImplementedInterfaces.add(currentInterface);
            allImplementedInterfaces.addAll(findAllImplementedInterfaces(currentInterface));
        }

        return allImplementedInterfaces;
    }
}
