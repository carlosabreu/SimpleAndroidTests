package com.example.simpleandroidtests.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class JClasseModeloTest {
    @Mock
    private JClasseASerMockada classeMockada;

    @Test
    public void deve_RetornarAConstante_CLASS_NAME_QuandoChamarOMetodoGetClassName() {
        assertEquals(JClasseModelo.CLASS_NAME, new JClasseModelo().getClassName());
        assertEquals("JavaModel", new JClasseModelo().getClassName());
    }

    @Test
    public void deve_SomarDoisNumerosInteiros_QuandoRecebeEssesNumeros() {
        assertEquals(4, new JClasseModelo().sum(2, 2));
    }

    @Test
    public void deve_SomarDoisNumerosDouble_QuandoRecebeEssesNumeros() {
        double delta = 0.001;
        assertEquals(4.5, new JClasseModelo().doubleSum(2.3, 2.2), delta);
    }

    @Test
    public void deve_RetornarAConstante_CLASS_NAME_QuandoChamarOMetodoGetClassName_UsandoHamcrest() {
        assertThat(JClasseModelo.CLASS_NAME, equalTo(new JClasseModelo().getClassName()));
    }

    @Test
    public void deve_SomarDoisNumerosDouble_QuandoRecebeEssesNumeros_UsandoHamcrest() {
        double delta = 0.001;
        assertEquals(4.5, new JClasseModelo().doubleSum(2.3, 2.2), delta);
    }

    @Test
    public void deve_receberUmaStringMockada_QuandoChamarOMetodoProcessStrings_ComWhen() {
        when(classeMockada.getString()).thenReturn("Este método foi mockado");
        assertEquals("Este método foi mockado e processado.",
                new JClasseModelo().processStrings(classeMockada));
    }

    @Test
    public void deve_receberUmaStringMockada_QuandoChamarOMetodoProcessStrings_comDoAnswer() {
        doAnswer(invocation -> "Este método foi mockado").when(classeMockada).getString();
        assertEquals("Este método foi mockado e processado.",
                new JClasseModelo().processStrings(classeMockada));
    }

    @Test
    public void deve_chamarACallback_QuandoOParametroDeEntradaForMaiorQue5() {
        JCallback callback = Mockito.mock(JCallback.class);
        new JClasseModelo().callCalbackIfNumberBiggerThan5(7, callback);
        Mockito.verify(callback).done();
    }

    @Test
    public void naoDeve_chamarACallback_QuandoOParametroDeEntradaForMenorQue5() {
        JCallback callback = Mockito.mock(JCallback.class);
        new JClasseModelo().callCalbackIfNumberBiggerThan5(2, callback);
        Mockito.verify(callback, never()).done();
    }
}