fun main(args : Array<String>){
    println("2~9단 출력")

    for(i in 2..9){
        println("$i"+"단")
        for(j in 1..9){
            println("$i * $j = ${i*j}")
        }
    }
}