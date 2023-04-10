package oop

// Cant do calc in the constructor
// Open allows inheritance, abstract is the same but cannot initialize abstract field
open class Person( var firstName : String = "test", var lastName: String = "test2", var age: Int = 23) {
//    var firstName: String = "John"
//    var lastName: String = "Smith"
//    var age: Int = 23
    val fullName:String
        get() = "$firstName $lastName"
    //secondary constructor
    constructor(years: Int) : this() {
        age += years
    }

    // This occurs before secondary constructor, can have multiple
    // open allows for override
    open val id : String
    init {
        id = fullName + age
    }
}

class Employee(company: String) : Person(), PersonActions{
    override val id: String = fullName + age + company

    override fun wearClothes() {
        println("Puttin my dick away")
    }
}