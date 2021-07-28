package com.example.simpleandroidtests.java;

import com.example.simpleandroidtests.kotlin.KClasseEstatica;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({JClasseEstatica.class, KClasseEstatica.class})
public class JClasseEstaticaTest {
    @Test
    public void deve_RetornarUmNumero_QuandoChamarOMetodoGetNumber() {
        assertEquals(1, JClasseEstatica.getNumber());
    }

    @Test
    public void deve_MockarOMetodogetNumber_QuandoEsteForChamado() {
        // Valor sem mock
        JClasseModelo modelo = new JClasseModelo();
        assertEquals(6, modelo.getNumber());

        // Valor com mock
        PowerMockito.mockStatic(JClasseEstatica.class, (Answer<Integer>) invocation -> 100);
        assertEquals(105, modelo.getNumber());
    }
}