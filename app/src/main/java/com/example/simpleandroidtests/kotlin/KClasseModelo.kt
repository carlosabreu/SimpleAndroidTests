package com.example.simpleandroidtests.kotlin

class KClasseModelo {
    companion object {
        const val CLASS_NAME = "KotlinModel"
    }

    fun getClassName(): String {
        return CLASS_NAME
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun doubleSum(a: Double, b: Double): Double {
        return a + b
    }

    fun callCalbackIfNumberBiggerThan5(number: Int, callback: KCallback) {
        if (number > 5) {
            callback.done()
        }
    }

    fun callLambdaIfNumberBiggerThan5(number: Int, callback: () -> Unit) {
        if (number > 5) {
            callback()
        }
    }

    fun processStrings(classeASerMockada: KClasseASerMockada): String? {
        return classeASerMockada.string + " e processado."
    }
}