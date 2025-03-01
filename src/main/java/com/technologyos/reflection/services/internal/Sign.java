package com.technologyos.reflection.services.internal;

enum Sign {
    EMPTY(' '),
    X('X'),
    Y('Y');

    private char value;

    Sign(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }
}
