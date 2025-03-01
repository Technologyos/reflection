package com.technologyos.reflection.exercises;

import com.technologyos.reflection.enums.Color;
import com.technologyos.reflection.services.Drawable;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class ClassInfoTest {

    @Test
    void validate_class_info() throws ClassNotFoundException {
        Class<String> stringClass = String.class;
        Map<String, Integer> mapObject = new HashMap<>();

        Class<?> hashMapClass = mapObject.getClass();

        Class<?> squareClass = Class.forName("com.technologyos.reflection.Main$Square");

        var circleObject = new Drawable() {
            @Override
            public int getNumberOfCorners() {
                return 0;
            }
        };

        //ClassInfo.printClassInfo(stringClass, hashMapClass, squareClass);
        ClassInfo.printClassInfo(Collection.class, boolean.class, int [][].class, Color.class, circleObject.getClass());
    }
}
