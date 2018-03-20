package ch.jaunerc.fibktl

import java.math.BigInteger

/**
 * This interface provides functions to calc fibonacci numbers.
 */
interface FibCalcInterface {

    /**
     * Calculates the nth fib number.
     */
    fun calcFibNumber(n: Int): BigInteger
}