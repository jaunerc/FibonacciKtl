package ch.jaunerc.fibktl

import org.junit.Assert.*
import org.junit.Test

/**
 * This class tests FibCalculator.
 */
class TestFibCalculator {

    @Test
    fun testCalcFibNumber() {
        val calculator = FibCalculator(FibAlgorithm.ITERATIVE)
        assertEquals(55, calculator.calcFibNumber(10).toInt())
    }
}