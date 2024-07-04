package com.technologyos.reflection.exercises;

import com.technologyos.reflection.classes.Address;
import com.technologyos.reflection.classes.Person;
import com.technologyos.reflection.web.WebServer;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorExampleTest {

    @Test
    void validate_new_instance() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        ConstructorExample.printConstructorData(Person.class);

        Address address = ConstructorExample.createInstanceWithArguments(Address.class, "First Street", 10);
        Person person = ConstructorExample.createInstanceWithArguments(Person.class, address, "John", 20);

        System.out.println(person);
    }

    @Test
    void create_server_configuration() throws IOException, InvocationTargetException, NoSuchMethodException,
        InstantiationException, IllegalAccessException {
        ConstructorExample.initConfiguration();
        WebServer webServer = new WebServer();
        webServer.startServer();
    }
}
