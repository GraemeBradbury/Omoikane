object MyModule {
    def abs (n: Int): Int =
        if (n < 0) -n
        else n


    def main(args: Array[String]): Unit = {
        println(formatResult("absolute value", -42, abs))
        println(formatResult("factorial", 7, factorial))
        println(formatResult("fibonnaci", 5, fibonacci))
    }

    def factorial(n: Int): Int = {
        @annotation.tailrec
        def go (n: Int, acc: Int) : Int =
            if (n <= 0) acc
            else go (n-1, n*acc)

        go(n, 1)
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

    private def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s of %d is %d"
        msg.format(name, n, f(n))
    }
}