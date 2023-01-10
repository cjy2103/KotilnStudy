fun main(args: Array<String>) {
//    val sum : (Int, Int) -> Int = {x, y -> x+y}
//    val sum = {x: Int , y : Int -> x+y}
//    val a = sum(2,3)
    //    print(a)
    plus(2,3, add = {
        a,b -> a+b
    })

    minus(10,5, subtract = {
        a,b -> a-b
        print("$a - $b -> ${a-b}")
    })

}

fun plus(a : Int, b : Int, add : (Int, Int) -> Int ){
    println("$a, $b -> ${add(a,b)}")
}

fun minus(a : Int, b : Int, subtract : (Int, Int) -> Unit){
    subtract(a,b)
}

//println("$a - $b -> ${a-b}")