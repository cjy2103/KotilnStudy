import java.util.*

fun main (args : Array<String>){
    var array = arrayOf(1,2,3,4,5)
    var array2 = Array(10,{0})
    var array3 = arrayOf(1,2,"���ڿ�",'A',5.5)

    println("�迭�� ��䰪")
    println(array.get(2))
    array.set(3,100)
    println(array.get(3))

    println("��ü �迭���: ${Arrays.toString(array)}")

    println("�迭2�� ũ��: ${array2.size}")

    println("��ü �迭���: ${Arrays.toString(array2)}")

    println("�迭3�� ũ��: ${array2.size}")

    println("��ü �迭���: ${Arrays.toString(array3)}")



}

