

fun main() {
    val num = Number()
    var result = 0;
    num.add(3,5){
        x,y -> result = x+y
    }
    println(result)
}

class Number{
    fun add(a: Int, b: Int, add : (Int, Int) -> Unit){
        add(a, b)
    }
}