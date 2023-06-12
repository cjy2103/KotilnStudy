fun main() {
    val triple: Triple<String, Int, Double> = Triple("철수", 175, 56.3)
    val name: String = triple.first
    val height: Int = triple.second
    val weight: Double = triple.third

    println("이름: $name, 키: $height cm, 가격: $weight kg") // 출력: 과일: Apple, 수량: 10, 가격: 4900
}