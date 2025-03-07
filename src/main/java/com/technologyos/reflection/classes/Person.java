package com.technologyos.reflection.classes;

public class Person {
    private final Address address;
    private final String name;
    private final int age;

    public Person(){
        this.name = "anonymous";
        this.age = 0;
        this.address = null;
    }

    public Person(String name){
        this.name = name;
        this.age = 0;
        this.address = null;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.address = null;
    }

    public Person(Address address, String name, int age){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
            "address=" + address +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
