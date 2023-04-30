fun main(args: Array<String>) {
//    val list = listOf(1,2,3,4,5)
//    val sum = list.fold(0) { acc, number -> acc + number}
//    println(sum)
//

    val list = listOf("Kotlin","fold","Example")
    val sentence = list.fold("") { acc , str -> "$acc $str"}
    println(sentence)
}