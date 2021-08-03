package com.example.simpleandroidtests.kotlin

class KSingleton private constructor() {
    val string: String
        get() = "Sem Mock"

    companion object {
        @JvmStatic
        val instance = KSingleton()
    }
}