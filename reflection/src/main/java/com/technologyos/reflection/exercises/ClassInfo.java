package com.technologyos.reflection.exercises;

public class ClassInfo {

    public static void printClassInfo(Class<?> ... classes){
        for (Class<?> clazz : classes){
            System.out.println(String.format("class name : %s, class package name : %s",
                clazz.getSimpleName(),
                clazz.getPackageName()));

            Class<?>[] implementedInterfaces = clazz.getInterfaces();
            for(Class<?> implementedInterface : implementedInterfaces){
                System.out.println(String.format("class %s implements: %s",
                    clazz.getSimpleName(),
                    implementedInterface.getSimpleName()));
            }

            System.out.println("Is array : " + clazz.isArray());
            System.out.println("Is primitive : "+ clazz.isPrimitive());
            System.out.println("Is enum : "+ clazz.isEnum());
            System.out.println("Is interface : "+ clazz.isInterface());
            System.out.println("Is anonymous : "+ clazz.isAnonymousClass());

            System.out.println();
            System.out.println();
        }
    }
}
