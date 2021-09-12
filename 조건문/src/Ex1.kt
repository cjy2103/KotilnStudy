fun main(args : Array<String>){

    print("점수입력:")
    var score = readLine()!!.toInt()
    if(score>=60){
        println("60점 이상")
    } else {
        println("60점 미만")
    }
}