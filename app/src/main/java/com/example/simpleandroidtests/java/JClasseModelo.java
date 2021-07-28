package com.example.simpleandroidtests.java;

public class JClasseModelo {
    public static String CLASS_NAME = "JavaModel";

    public String getClassName() {
        return CLASS_NAME;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double doubleSum(double a, double b) {
        return a + b;
    }

    public void callCalbackIfNumberBiggerThan5(int number, JCallback callback) {
        if (number > 5) {
            callback.done();
        }
    }

    public String processStrings(JClasseASerMockada classeASerMockada) {
        return classeASerMockada.getString() + " e processado.";
    }

    public int getNumber() {
        return JClasseEstatica.getNumber() + 5;
    }
}