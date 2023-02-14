fun main(args: Array<String>) {
    val person = Person()
    person.setName("홍길동")
    person.setAge(20)
    println("이름 : ${person.getName()}\n나이 : ${person.getAge()}")
}