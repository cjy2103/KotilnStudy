fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,4,5)
//    val result = numbers.none{it > 10}
//    println(result)
    val result = numbers.any { it > 3 }
    println(result)
}