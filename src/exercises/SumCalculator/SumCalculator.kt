package exercises.SumCalculator

class SimpleCalculator{
    private var firstNumber: Double = 0.0
    private var secondNumber: Double = 0.0

    fun getFirstNumber(): Double = this.firstNumber
    fun getSecondNumber(): Double = this.secondNumber
    fun setFirstNumber(value: Double) {
        this.firstNumber = value
    }
    fun setSecondNumber(value: Double) {
        this.secondNumber = value
    }

    fun getAdditionResult(): Double = this.firstNumber+this.secondNumber
    fun getSubtractionResult(): Double = this.firstNumber-this.secondNumber
    fun getMultiplicationResult(): Double = this.firstNumber*this.secondNumber
    fun getDivisionResult(): Double = if (this.secondNumber != 0.0) this.firstNumber/this.secondNumber else 0.0
}

fun main(){
    val calculator: SimpleCalculator = SimpleCalculator()
    calculator.setFirstNumber(5.0)
    calculator.setSecondNumber(4.0)
    System.out.println("add= " + calculator.getAdditionResult())
    System.out.println("subtract= " + calculator.getSubtractionResult())
    calculator.setFirstNumber(5.25)
    calculator.setSecondNumber(0.0)
    System.out.println("multiply= " + calculator.getMultiplicationResult())
    System.out.println("divide= " + calculator.getDivisionResult())

}