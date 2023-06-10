fun main() {
    val name = "철수"
        .also { println("원래 이름 : $it") }
        .run { "영희" }
        .also { println("바뀐 이름 : $it") }

    println(name)
}