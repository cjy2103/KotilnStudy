fun main(arrgs : Array<String>){
    println("1~10 사이중 4로 나누어떨어지는수")

    var i =1
    while(i<10) {
        if(i%4==0){
            println("$i")
        }
        i++
    }
}