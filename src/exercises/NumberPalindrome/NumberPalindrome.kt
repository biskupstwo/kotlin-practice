package exercises.NumberPalindrome

fun isPalindrome(number: Int): Boolean{
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

    return number == reversedNumber
}

fun main(){
    println(isPalindrome(-1221))
    println(isPalindrome(707))
    println(isPalindrome(11212))
}