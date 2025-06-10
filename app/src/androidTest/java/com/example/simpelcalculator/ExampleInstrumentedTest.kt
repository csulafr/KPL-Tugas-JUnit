package com.example.simplecalculator

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    /* Test Case 1: Input 2 dan 3, klik tombol tambah, hasil harus 5 */
    @Test
    fun additionInstrumentedTest() {
        onView(withId(R.id.input1)).perform(typeText("4"), closeSoftKeyboard())
        onView(withId(R.id.input2)).perform(typeText("1"), closeSoftKeyboard())
        onView(withId(R.id.buttonAdd)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("Hasil: 5")))
    }

    /* Test Case 2: Input 7 dan 4, klik tombol kurang, hasil harus 3 */
    @Test
    fun subtractionInstrumentedTest() {
        onView(withId(R.id.input1)).perform(typeText("8"), closeSoftKeyboard())
        onView(withId(R.id.input2)).perform(typeText("5"), closeSoftKeyboard())
        onView(withId(R.id.buttonSubtract)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("Hasil: 3")))
    }
}
