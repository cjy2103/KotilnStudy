class Child : Parent() {
    companion object {
//        val strChild = "자식메서드"
        val str = "자식 메서드"
    }

    fun print1(){
//        println(strChild)
        println(str)
    }

//    fun print2(){
//        println(parentStr)
//    }
}