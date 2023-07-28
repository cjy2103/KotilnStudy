fun main(args: Array<String>) {
//    val helloGreeter = Greeter("Hello")
//    helloGreeter("John")

    val processor = MyLambdaProcessor()
    processor{
        println("This is a lambda expression.")
    }
}