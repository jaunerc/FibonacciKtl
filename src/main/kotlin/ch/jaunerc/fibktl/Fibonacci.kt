package ch.jaunerc.fibktl

import java.math.BigInteger

/**
 * Throws an exception for not defined fib numbers.
 */
fun throwFibExceptionForUndefNum(n: Int) {
    if (n < 0) throw Exception("Not defined for negative numbers.")
}

/**
 * Finds the nth fibonacci number. This function is iterative implemented.
 */
fun fibIt(n: Int): BigInteger {
    throwFibExceptionForUndefNum(n)
    if (n < 2) {
        return BigInteger.valueOf(n.toLong())
    }
    var fibPrev = BigInteger.valueOf(0)
    var fib = BigInteger.valueOf(1)
    for (i in 2..n) {
        var temp = fib
        fib += fibPrev
        fibPrev = temp
    }
    return fib
}

/**
 * Finds the nth fibonacci number. This function is recursive implemented with an accumulator.
 */
fun fibAccuBig(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    throwFibExceptionForUndefNum(n)
    if (n == 0) return a
    else {
        return fibAccuBig(n - 1, b, a + b)
    }
}

/**
 * Returns the nth fibonacci number. This function is just a wrapper for the fibAccBig function.
 */
fun fibAccu(n: Int): BigInteger {
    return fibAccuBig(n, BigInteger.ZERO, BigInteger.ONE)
}

/**
 * Finds the nth fibonacci number. This function is tail recursive implemented.
 */
tailrec fun fibTrBig(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    throwFibExceptionForUndefNum(n)
    if (n == 0) return a
    else {
        return fibTrBig(n - 1, b, a + b)
    }
}

/**
 * Returns the nth fibonacci number. This function is just a wrapper for the fibTrBig function.
 */
fun fibTr(n: Int): BigInteger {
    return fibTrBig(n, BigInteger.ZERO, BigInteger.ONE)
}

/**
 * Finds the nth fibonacci number. This recursive function follows the fibonacci definition and is NOT optimized.
 * A function call for big n will result in long wait time ;-)
 */
fun fibRec(n: Int): BigInteger {
    throwFibExceptionForUndefNum(n)
    if (n < 2) return BigInteger.valueOf(n.toLong())
    else {
        var f1 = fibRec(n - 1)
        var f2 = fibRec(n - 2)
        return f1 + f2
    }
}