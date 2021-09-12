fun main(args : Array<String>){
    print("점수입력")
    var score = readLine()!!.toInt()
    when(score/10){
        9 -> print("A")
        8 -> print("B")
        7 -> print("C")
        6 -> print("D")
        else -> print("F")
    }

    if(score>60 && score%10 >= 5){
        print("+")
    }

}