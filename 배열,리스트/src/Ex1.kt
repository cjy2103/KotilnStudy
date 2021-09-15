import java.util.*

fun main (args : Array<String>){
    var array = arrayOf(1,2,3,4,5)
    var array2 = Array(10,{0})
    var array3 = arrayOf(1,2,"문자열",'A',5.5)

    println("배열에 담긴값")
    println(array.get(2))
    array.set(3,100)
    println(array.get(3))

    println("전체 배열출력: ${Arrays.toString(array)}")

    println("배열2의 크기: ${array2.size}")

    println("전체 배열출력: ${Arrays.toString(array2)}")

    println("배열3의 크기: ${array2.size}")

    println("전체 배열출력: ${Arrays.toString(array3)}")



}

