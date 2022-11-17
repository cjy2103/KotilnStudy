class Test {
    val function = { println("1급함수 테스트") }

    fun function2(f: () -> Unit) {
        f.invoke()
    }

    fun function3() : () -> Unit {
        return function
    }
}