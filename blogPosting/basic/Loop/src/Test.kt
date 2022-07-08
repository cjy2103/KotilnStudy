class Test {

    fun loopTest(){
        for (i : Int in 1..5){
            print("값은 $i");
        }

        for(i in 1..5){
            println("값은 $i")
        }

        for(i in 1 until 5){
            println("값은 $i")
        }
    }

    fun loopTest2(){

        for(i in 1..10 step(2)){
            println("값은 $i")
        }

//        for(i in 10..1 step(-2)){ // error : argument 음수 지원 x
//            println("값은 $i")
//        }
    }

    fun downToLoop(){
        for(i in 10 downTo 1){
            println("값은 $i")
        }

        for(i in 10 downTo 1 step (4)){
            println("값은 $i")
        }
    }

    fun intArrayLoop(){
        val arr : IntArray = intArrayOf(1,2,3,4,5)

        for(i in arr){
            println("값은 $i")
        }

        for(i in arr.reversed()){
            println("값은 $i")
        }
    }

    fun strArrayLoop(){
        val list = listOf<String>("사과","바나나","망고")
        for(i in list){
            println("값은 $i")
        }

        for(i in 0 until list.count()){
            println("값은 $i")
        }
    }

    fun whileLoop(){
        var i : Int = 1
        while (i < 10){
            println("값은 ${i++}")
        }

        do{
            println("값은 ${i--}")
        }while (i > 0)
    }


}