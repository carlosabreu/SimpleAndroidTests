package com.example.simpleandroidtests.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class JSingletonTest {

    @Test
    public void deve_RetornarSemMock_QuandoChamarOMetodoGetString() {
        assertEquals("Sem Mock", JSingleton.getInstance().getString());
    }

    @Test
    public void deve_RetornarMock_QuandoChamarOMetodoGetStringMockado() {
        // É possível pegar uma instância de singleton e mocker
        JSingleton instance = Mockito.spy(JSingleton.getInstance());
        Mockito.when(instance.getString()).thenReturn("Mock");
        assertEquals("Mock", instance.getString());

        // Infelizmente, não mocka o objeto principal
        assertEquals("Sem Mock", JSingleton.getInstance().getString());
    }
}