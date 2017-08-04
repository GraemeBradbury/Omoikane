#REPL

:load <- command to get the REPL to interprete a scala source file.


standard library
    compose
    andThen

case class Cons...
    case class is data constructor
    Cons is traditionally short for construct

case class Cons[+A]
    ploymorphic in type it contains 'A'
    + means covariant

def apply[A] (as: A*): List[A]
    * means variadic function. means zero or more arguments.
page 52