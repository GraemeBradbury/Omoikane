object MyModule {
    def abs (n: Int): Int =
        if (n < 0) -n
        else n

    private def formatAbs(x: Int) = {
        val msg = "The absolute value of %d is %d"
        msg.format(x, abs(x))
    }

    def main(args: Array[String]): Unit = {
        println(formatAbs(-42))
        println(formatFactorial(6))
        println(formatFibonacci(6))
    }

    def factorial(n: Int): Int = {
        @annotation.tailrec
        def go (n: Int, acc: Int) : Int =
            if (n <= 0) acc
            else go (n-1, n*acc)

        go(n, 1)
    }

    private def formatFactorial(x: Int) = {
        val msg = "The factorial of %d is %d"
        msg.format(x, factorial(x))
    }

    def fibonacci(x: Int) : Int = {
        if (x == 0) return 0
        if (x == 1) return 0
        if (x == 2) return 1
        @annotation.tailrec
        def go(count: Int, p: Int, pp: Int) : Int = {
            if (count <= 0 ) p
            else go (count -1, p +pp, p)
        }

        go(x-2, 1, 0)
    }

    private def formatFibonacci(x: Int) = {
        val msg = "The %dth fibonacci is %d"
        msg.format(x, fibonacci(x))
    }
}