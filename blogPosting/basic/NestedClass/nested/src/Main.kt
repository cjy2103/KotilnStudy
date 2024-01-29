fun main() {
    val outer = Outer.Nested().printMessage()
    println(outer)
    val outerInstance = Outer2()  // Outer2 클래스의 인스턴스 생성
    val innerInstance = outerInstance.Inner().printOuterProperty()  // Outer2 인스턴스를 전달하여 Inner 인스턴스 생성
    println(innerInstance)
}