package exercises.FirstAndLastDigitSum

fun sumFirstAndLastDigit(number: Int): Int{
    if (number < 0 ) return -1
    return number.toString()[0].digitToInt() + number.toString().get(number.toString().length-1).digitToInt()
}

fun main(){
    println(sumFirstAndLastDigit(252))
    println(sumFirstAndLastDigit(257))
    println(sumFirstAndLastDigit(0))
    println(sumFirstAndLastDigit(5))
    println(sumFirstAndLastDigit(-10))
}