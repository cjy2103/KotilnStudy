fun main(args: Array<String>) {

//    val sum : (Int, Int) -> Int = {x, y -> x+y}
    val sum = {x: Int , y : Int -> x+y}
    val a = sum(2,3)
    print(a)
}


