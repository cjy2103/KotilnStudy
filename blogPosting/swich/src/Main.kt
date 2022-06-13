fun main(){
    print("1 ~ 3 값을 입력하세요\n")

    when(readLine()){
        "1" -> print("1입력")
        "2" -> print("2입력")
        "3" -> print("3입력")
        else -> print("1 ~ 3사이의 값을 입력하세요")
    }
}