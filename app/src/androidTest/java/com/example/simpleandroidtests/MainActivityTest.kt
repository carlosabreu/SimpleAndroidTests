package com.example.simpleandroidtests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

@LargeTest
class MainActivityTest {

    @get:Rule
    var activity = ActivityTestRule(MainActivity::class.java, true, true)

    @Test
    fun deve_AparecerOTextoCasa() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}