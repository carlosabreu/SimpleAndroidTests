package com.example.simpleandroidtests.java;

public class JSingleton {
    private static JSingleton instance = new JSingleton();

    private JSingleton() {

    }

    public static JSingleton getInstance() {
        return instance;
    }

    public String getString() {
        return "Sem Mock";
    }
}
