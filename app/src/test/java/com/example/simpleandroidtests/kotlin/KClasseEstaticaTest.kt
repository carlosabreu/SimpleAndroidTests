package com.example.simpleandroidtests.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class KClasseEstaticaTest {
    @Test
    fun deve_RetornarUmNumero_QuandoChamarOMetodoGetNumber() {
        assertEquals(2, KClasseEstatica.getNumber().toLong())
    }
}