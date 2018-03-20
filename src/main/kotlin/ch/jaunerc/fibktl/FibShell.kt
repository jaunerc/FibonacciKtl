package ch.jaunerc.fibktl

class FibShell {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            try {
                calcAndShowResult(args)
            } catch (e: Exception) {
                println("ERROR: " + e.message)
                printUsage()
            }
        }
    }
}

fun calcAndShowResult(args: Array<String>) {
    val n = args[0].toInt()
    val calculator = getCalculatorByArgs(args[1])
    val result = calculator.calcFibNumber(n)
    println("The $n fibonacci number is:")
    println("$result")
}

fun printUsage() {
    println("Fibonacci number calculator")
    println("Usage: FibShell N [ALGORITHM]")
    print("-> ALGORITHM: ")
    for (algo in FibAlgorithm.values()) {
        print("$algo | ")
    }
}

fun getCalculatorByArgs(algorithmName: String): FibCalcInterface {
    val algorithm = FibAlgorithm.valueOf(algorithmName)
    return FibCalculator(algorithm)
}

