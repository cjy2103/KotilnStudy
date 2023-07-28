class MyLambdaProcessor {
    operator fun invoke(action: () -> Unit){
        println("Processing started.")
        action()
        println("Processing finished.")
    }
}