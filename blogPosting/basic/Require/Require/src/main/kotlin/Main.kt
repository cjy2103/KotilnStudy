fun main(args: Array<String>) {
    val result = divide(10,2)
    println(result)

    // 예외 발생 코드
    val invalidResult = divide(10, 0)
    println(invalidResult)


}

fun divide(a: Int, b : Int) : Int{
    require(b !=0) {
        "Divider must not be zero."
    }
    return a/b
}