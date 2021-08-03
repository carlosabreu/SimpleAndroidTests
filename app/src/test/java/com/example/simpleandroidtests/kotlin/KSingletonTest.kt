package com.example.simpleandroidtests.kotlin

import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito

class KSingletonTest {
    @Test
    fun deve_RetornarSemMock_QuandoChamarOMetodoGetString() {
        Assert.assertEquals("Sem Mock", KSingleton.instance.string)
    }

    @Test
    fun deve_RetornarMock_QuandoChamarOMetodoGetStringMockado() {
        // É possível pegar uma instância de singleton e mocker
        val instance = Mockito.spy(KSingleton.instance)
        Mockito.`when`(instance.string).thenReturn("Mock")
        Assert.assertEquals("Mock", instance.string)

        // Infelizmente, não mocka o objeto principal
        Assert.assertEquals("Sem Mock", KSingleton.instance.string)
    }
}