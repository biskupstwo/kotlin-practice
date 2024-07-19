package exercises.ComplexOperations

class ComplexNumber(
    real: Double,
    imaginary: Double
){
    var real: Double = real
    var imaginary: Double = imaginary

    fun add(real: Double, imaginary: Double){
        this.real += real
        this.imaginary += imaginary
    }
    fun add(number: ComplexNumber){
        real += number.real
        imaginary += number.imaginary
    }
    fun subtract(real: Double, imaginary: Double){
        this.real -= real
        this.imaginary -= imaginary
    }
    fun subtract(number: ComplexNumber){
        real -= number.real
        imaginary -= number.imaginary
    }
}

fun main(){
    val one = ComplexNumber(1.0, 1.0)
    val number = ComplexNumber(2.5, -1.5)
    one.add(1.0, 1.0)
    println("one.real= " + one.real)
    println("one.imaginary= " + one.imaginary)
    one.subtract(number)
    println("one.real= " + one.real)
    println("one.imaginary= " + one.imaginary)
    number.subtract(one)
    println("number.real= " + number.real)
    println("number.imaginary= " + number.imaginary)
}