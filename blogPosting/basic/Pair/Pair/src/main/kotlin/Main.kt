fun main() {
    // 일반적인 방법으로 생성
    val pair : Pair<String, Int> = Pair("사과", 10)
    // to 함수를 이용해서 Pair 생성
    val pair2 : Pair<String, Int> = "바나나" to 5

    val fruit : String = pair.first
    val quantity : Int = pair.second

    val fruit2 : String = pair2.first
    val quantity2 : Int = pair2.second

    println("과일:$fruit\n수량:$quantity")

    println("과일:$fruit2\n수량:$quantity2")

}