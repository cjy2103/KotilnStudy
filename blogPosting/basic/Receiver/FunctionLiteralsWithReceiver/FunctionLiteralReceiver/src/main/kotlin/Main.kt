fun main() {

    val add = fun Int.(number: Int): Int = this + number

    val num = 5

    print(num.add(5))
}