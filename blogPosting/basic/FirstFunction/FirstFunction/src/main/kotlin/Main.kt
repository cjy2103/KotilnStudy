fun main(args: Array<String>) {

//    val test = Test()
//
//    val a = test.function
//    a.invoke()
//
//    test.function2(a)
//
//    test.function3().invoke()
    val calculation = Calculation()

    println("덧셈 :" + calculation.add(5, 10))
    println("뺄셈 :" + calculation.subscribe(10, 5))
    println(
        "리스트 형식 : 덧셈 :" + calculation.functions[0](5, 10) +
                   " 뺄셈 : ${calculation.functions[1](10,5)}" // + 말고 $로도 사용가능
    )
}