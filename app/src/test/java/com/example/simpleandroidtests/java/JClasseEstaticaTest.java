package com.example.simpleandroidtests.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JClasseEstaticaTest {
    @Test
    public void deve_RetornarUmNumero_QuandoChamarOMetodoGetNumber() {
        assertEquals(1, JClasseEstatica.getNumber());
    }
}