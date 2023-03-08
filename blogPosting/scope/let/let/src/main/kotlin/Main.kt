fun main(args: Array<String>) {
    var str : String? = null

    str?.let { println("Null 아님") } ?: run { println("Null 임") }

}