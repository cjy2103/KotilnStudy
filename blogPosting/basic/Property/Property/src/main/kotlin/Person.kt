class Person {
    private lateinit var name : String
    private var age : Int = 0

    fun getName() = name
    fun getAge() = age

    fun setName(value : String){
        this.name = value
    }

    fun setAge(value: Int){
        this.age = value
    }
}