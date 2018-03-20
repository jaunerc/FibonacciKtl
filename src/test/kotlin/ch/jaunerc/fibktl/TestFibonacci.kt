package ch.jaunerc.fibktl

import org.junit.Assert.*
import org.junit.Test

/**
 * This class tests Fibonacci functions.
 */
class TestFibonacci {
    @Test
    fun testFibIt() {
        assertEquals(55, fibIt(10).toInt())
    }

    @Test
    fun testFibAccu() {
        assertEquals(55, fibAccu(10).toInt())
    }

    @Test
    fun testFibTr() {
        assertEquals(55, fibTr(10).toInt())
    }

    @Test
    fun testFibRec() {
        assertEquals(55, fibRec(10).toInt())
    }

    @Test(expected = Exception::class)
    fun testException() {
        fibIt(-1)
    }
}