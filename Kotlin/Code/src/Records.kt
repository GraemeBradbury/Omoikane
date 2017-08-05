class Person(val name: String)

class rectangle(val width :Int, val height :Int) {
    val isSquare :Boolean
        get() {
            return height == width
        }
}