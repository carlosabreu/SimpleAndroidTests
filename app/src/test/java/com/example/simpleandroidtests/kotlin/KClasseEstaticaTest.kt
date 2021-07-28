package com.example.simpleandroidtests.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
@PrepareForTest(KClasseEstatica::class)
class KClasseEstaticaTest {
    @Test
    fun deve_RetornarUmNumero_QuandoChamarOMetodoGetNumber() {
        assertEquals(2, KClasseEstatica.getNumber())
    }
}