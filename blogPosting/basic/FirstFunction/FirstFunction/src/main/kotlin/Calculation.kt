class Calculation {
    fun add(a : Int, b : Int) = a + b
    fun subscribe(a : Int, b : Int) = a - b

    val functions = mutableListOf(::add, ::subscribe)
}