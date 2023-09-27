class Person(val name: String, val age: Int) {

    constructor(address : String) : this("철수",15){
        println("Name: $name, Age: $age, Address : $address")
    }

    init {
        println("Name: $name, Age: $age")
    }


}