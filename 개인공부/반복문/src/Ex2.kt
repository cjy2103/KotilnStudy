fun main(args : Array<String>){
    println("2~9�� ���")

    for(i in 2..9){
        println("$i"+"��")
        for(j in 1..9){
            println("$i * $j = ${i*j}")
        }
    }
}