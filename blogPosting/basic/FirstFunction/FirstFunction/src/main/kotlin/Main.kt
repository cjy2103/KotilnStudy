fun main(args: Array<String>) {

    val test = Test()

    val a = test.function
    a.invoke()

    test.function2(a)

    test.function3().invoke()
}