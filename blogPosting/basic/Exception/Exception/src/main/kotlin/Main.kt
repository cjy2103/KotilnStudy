fun main(){
    var str : String? = null
    try {
        if(str!!.isEmpty()){
            println("공백")
        } else {
            println("출력")
        }
    } catch (e : NullPointerException){
        println("NPE 발생, 상새내용: $e")
    } finally {
        println("일단 그냥 출력시킴")
    }

}
