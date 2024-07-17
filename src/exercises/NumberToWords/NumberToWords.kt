package exercises.NumberToWords

fun numberToWord(number: Int): String {
    return when (number){
        0 -> "ZERO"
        1 -> "ONE"
        2 -> "TWO"
        3 -> "THREE"
        4 -> "FOUR"
        5 -> "FIVE"
        6 -> "SIX"
        7 -> "SEVEN"
        8 -> "EIGHT"
        9 -> "NINE"
        else -> "OTHER"
    }
}
fun getDigitCount(number: Int): Int = if (number > 0) (Math.log10(number.toDouble())+1).toInt() else if (number == 0) 1 else -1

fun reverse(number: Int): Int {

    var reversedNumber = 0
    var numberToReverse = number

    if (number < 0) {
        numberToReverse *= -1
    }
    while (numberToReverse > 0) {
        reversedNumber = reversedNumber * 10 + (numberToReverse % 10)
        numberToReverse /= 10
    }
    if (number < 0) {
        reversedNumber *= -1
    }

    return reversedNumber
}

fun numberToWords(number: Int) {
    val digitCount: Int = getDigitCount(number)
    if (digitCount == -1){
        println("Invalid Value")
        return
    }
    var reversedNumber: Int = reverse(number)
    val reversedNumberDigitCount: Int = getDigitCount(reversedNumber)
    val digitCountDifference: Int = digitCount - reversedNumberDigitCount
    var numberInWords: String = ""

    while (reversedNumber > 0){
        numberInWords += "${numberToWord(reversedNumber % 10)} "
        reversedNumber /= 10
    }

    if (digitCountDifference > 0){
        repeat(digitCountDifference){
            numberInWords += "${numberToWord(0)} "
        }
    }
    println(numberInWords)
}

fun main(){
    println(getDigitCount(0))
    println(getDigitCount(123))
    println(getDigitCount(-12))
    println(getDigitCount(5200))
    println(reverse(-121))
    println(reverse(1212))
    println(reverse(1234))
    println(reverse(100))
    numberToWords(123)
    numberToWords(1010)
    numberToWords(1000)
    numberToWords(-12)
}