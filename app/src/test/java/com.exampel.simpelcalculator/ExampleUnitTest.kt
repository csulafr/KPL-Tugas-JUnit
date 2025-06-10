package com.example.simplecalculator

import org.junit.Test
import org.junit.Assert.*

class ExampleUnitTest {

    /* Test Case 1: Penjumlahan */
    @Test
    fun testAddition() {
        val result = 2 + 3
        assertEquals(5, result)
    }

    /* Test Case 2: Pengurangan*/
    @Test
    fun testSubtraction() {
        val result = 9 - 4
        assertEquals(5, result)
    }
}
