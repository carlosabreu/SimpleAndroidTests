package com.example.simpleandroidtests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    var activity = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun deve_AparecerOTextoHelloWorld() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }

    @Test
    fun deve_AcharAViewPeloID() {
        onView(withId(R.id.textview)).check(matches(isDisplayed()))
    }

    @Test
    fun deve_AcharUmaViewComTextEID() {
        onView(allOf(withText("Hello World!"), withId(R.id.textview))).check(matches(isDisplayed()))
    }
}