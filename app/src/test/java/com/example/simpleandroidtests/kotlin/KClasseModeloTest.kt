package com.example.simpleandroidtests.kotlin

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.number.IsCloseTo.closeTo
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.never

class KClasseModeloTest {
    @Test
    fun deve_RetornarAConstante_CLASS_NAME_QuandoChamarOMetodoGetClassName() {
        assertEquals(KClasseModelo.CLASS_NAME, KClasseModelo().getClassName())
        assertEquals("KotlinModel", KClasseModelo().getClassName())
    }

    @Test
    fun deve_SomarDoisNumeros_QuandoRecebeEssesNumeros() {
        assertEquals(4, KClasseModelo().sum(2, 2))
    }

    @Test
    fun deve_SomarDoisNumerosDouble_QuandoRecebeEssesNumeros() {
        val error = 0.001
        assertEquals(4.5, KClasseModelo().doubleSum(2.3, 2.2), error)
    }

    @Test
    fun deve_RetornarAConstante_CLASS_NAME_QuandoChamarOMetodoGetClassName_UsandoHamcrest() {
        assertThat(KClasseModelo.CLASS_NAME, equalTo(KClasseModelo().getClassName()))
    }

    @Test
    fun deve_SomarDoisNumerosDouble_QuandoRecebeEssesNumeros_UsandoHamcrest_UsandoHamcrest() {
        val error = 0.001
        assertThat(4.5, closeTo(KClasseModelo().doubleSum(2.3, 2.2), error))
    }

    @Test
    fun deve_chamarACallback_QuandoOParametroDeEntradaForMaiorQue5() {
        val callback = Mockito.mock(
            KCallback::class.java
        )
        KClasseModelo().callCalbackIfNumberBiggerThan5(7, callback)
        Mockito.verify(callback).done()
    }

    @Test
    fun naoDeve_chamarACallback_QuandoOParametroDeEntradaForMenorQue5() {
        val callback = Mockito.mock(
            KCallback::class.java
        )
        KClasseModelo().callCalbackIfNumberBiggerThan5(2, callback)
        Mockito.verify(callback, never()).done()
    }
}