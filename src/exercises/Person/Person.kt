package exercises.Person

class Person {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0
        set(value) {
            if (value in 0..100) field = value else field = 0
        }

    fun isTeen(): Boolean = age in 13..19

    fun getFullName(): String {
        val returnVal = when{
            firstName.isEmpty() -> lastName
            lastName.isEmpty() -> firstName
            firstName.isEmpty() && lastName.isEmpty() -> ""
            else -> "$firstName $lastName"
        }
        return returnVal
    }
}

fun main(){
    val person: Person = Person()
    person.firstName = ""
    person.lastName = ""
    person.age = 10
    println("fullName= ${person.getFullName()}")
    println("teen= ${person.isTeen()}")
    person.firstName = "John"
    person.age = 18
    println("fullName= ${person.getFullName()}")
    println("teen= ${person.isTeen()}")
    person.lastName = "Smith"
    println("fullName= ${person.getFullName()}")
    person.age = 102
    print("age= ${person.age}")
}