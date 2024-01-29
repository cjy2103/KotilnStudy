class Outer2 {
    private val outerProperty : Int = 10
    inner class Inner {
        fun printOuterProperty() = outerProperty
    }
}