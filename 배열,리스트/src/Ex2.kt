fun main(args : Array<String>){
    var arrList = arrayListOf<Int>(1,2,3,4,5)

    println("arrayList ���")

    arrList.forEach( {print("$it ")})

    println()
    println("arrayList ����")
    arrList.add(15)
    arrList.add(10)
    arrList.add(0, 100) // index = 0�� 100 ����

    println("size = ${arrList.size}")
    arrList.forEach( {print("$it ")})

    println()
    println("arrayList ����")

    arrList.remove(3)
    arrList.removeAt(4)

    println("size = ${arrList.size}")
    arrList.forEach( {print("$it ")})

    println()
    println("\n============ArrayList to Array==================")
    /* ArrayList to Array */
    if(arrList is ArrayList<Int>) {
        println("ArrayList")
    }

    val arr2 = arrList.toArray()
    if(arr2 is Array) {
        println("Array")
    }


}