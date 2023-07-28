class Greeter(private val greeting: String) {
    operator fun invoke(name: String){
        println("$greeting, $name!")
    }
}