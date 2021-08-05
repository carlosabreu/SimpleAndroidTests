package com.example.simpleandroidtests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test

class HideAndShowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun should_hideTextAndChangeButtonText_AfterClickOnTheButton() {
        val button = onView(
            allOf(
                withId(R.id.button),
                isDisplayed()
            )
        )
        button.perform(click())

        val textView = onView(
            allOf(
                withId(R.id.textview), withText("Hello World!"),
                withParent(withParent(withId(android.R.id.content))),
            )
        )
        textView.check(matches(not(isDisplayed())))

        val buttonFinalSituation = onView(
            allOf(
                withId(R.id.button),
                withText("Show text"),
            )
        )
        buttonFinalSituation.check(matches(isDisplayed()))
    }

    @Test
    fun should_showTextAgain_AfterTwoClickcOnTheButton() {
        val button = onView(
            allOf(
                withId(R.id.button),
                isDisplayed()
            )
        )
        button.perform(click())
        button.perform(click())

        val textView = onView(
            allOf(
                withId(R.id.textview), withText("Hello World!"),
                withParent(withParent(withId(android.R.id.content))),
            )
        )
        textView.check(matches(isDisplayed()))

        val buttonFinalSituation = onView(
            allOf(
                withId(R.id.button),
                withText("Hide the text"),
            )
        )
        buttonFinalSituation.check(matches(isDisplayed()))
    }
}
