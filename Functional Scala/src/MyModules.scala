object MyModule {

    def main(args: Array[String]): Unit = {
        val order = Array(1,2,3,4,5)
        var disorder = Array(2,1,3,5,4,7,6)
        def ordered (a :Int, b: Int): Boolean =
            b >= a
        
        println(isSorted(order, ordered))
        println(isSorted(disorder, ordered))
    }

    def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        if (as.length <= 1) true
        else {
            @annotation.tailrec
            def loop(n: Int): Boolean = 
                if (n >= as.length) true
                else if (!ordered(as(n-1), as(n))) false
                else loop(n+1)

            loop(1)
        }
    }

    def uncurry[A,B,C] (f: A => B => C) : (A, B) => C = {
        (a: A, b: B) => f(a)(b)
    }

    def compose[A,B,C] (f: B=>C, g: A=>B ): A => C = 
        (a: A) => f(g(a))
}