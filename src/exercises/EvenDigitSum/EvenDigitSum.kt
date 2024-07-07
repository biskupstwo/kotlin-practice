package exercises.EvenDigitSum

fun getEvenDigitSum(number: Int): Int{
    if (number < 0) return -1
    var sum: Int = 0
    var tmp: Int
    var numberTmp = number

    while (numberTmp > 0){
        tmp = numberTmp % 10
        if (tmp%2 == 0) sum += tmp
        numberTmp  /= 10
    }
    return sum
}

fun main(){
    println(getEvenDigitSum(123456789))
    println(getEvenDigitSum(252))
    println(getEvenDigitSum(-22))
}