package ch.jaunerc.fibktl

import java.math.BigInteger

/**
 * This class represents a calculator for fibonacci numbers.
 */
class FibCalculator(var fibAlgorithm: FibAlgorithm): FibCalcInterface {

    override fun calcFibNumber(n: Int): BigInteger {
        when (fibAlgorithm) {
            FibAlgorithm.ITERATIVE -> return fibIt(n)

            FibAlgorithm.RECURSIVE -> return fibRec(n)

            FibAlgorithm.RECURSIVE_ACCU -> return fibAccu(n)

            FibAlgorithm.TAIL_RECURSIVE -> return fibTr(n)

            else -> {
                throw Exception("Algorithm is not supported.")
            }
        }
    }
}