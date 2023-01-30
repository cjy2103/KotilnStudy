fun main(args: Array<String>) {
//    val array = intArrayOf(1,2,3,4,5) // int배열 생성
//    val array2 = Array(10) { 0 } // 크기 10에 0으로 초기화
//    val array3 = arrayOf("봄","여름","가을","겨울") // String 배열 생성
//
//    println(array.contentToString())
//    println(array2.contentToString())
//    println(array3.contentToString())
    val array = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
    val array2 = arrayOf(arrayOf("봄"),arrayOf("여름"),arrayOf("가을"),arrayOf("겨울"))
    val array3 = arrayOf(arrayOf(arrayOf("봄","여름","가을","겨울")))

    println(array.contentDeepToString())
    println(array2.contentDeepToString())
    println(array3.contentDeepToString())
}