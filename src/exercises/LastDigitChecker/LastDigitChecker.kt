package exercises.LastDigitChecker

fun hasSameLastDigit(input1: Int, input2: Int, input3: Int): Boolean{
    if (!isValid(input1) || !isValid(input2) || !isValid(input3)) return false
    return input1 % 10 == input2 % 10 || input2 % 10 == input3 % 10 || input1 % 10 == input3 % 10
}

fun isValid(input: Int): Boolean = input in 10..1000

fun main(){
    println(hasSameLastDigit(41, 22, 71))
    println(hasSameLastDigit(23, 32, 42))
    println(hasSameLastDigit(9, 99, 999))
}