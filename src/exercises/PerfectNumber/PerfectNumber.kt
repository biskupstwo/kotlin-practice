package exercises.PerfectNumber

fun isPerfectNumber(number: Int): Boolean{
    if (number < 1) return false
    var sum: Int = 0
    for (i in 1..number-1){
        sum += if (number%i==0) i else 0
    }
    return sum == number
}

fun main(){
    println(isPerfectNumber(6))
    println(isPerfectNumber(28))
    println(isPerfectNumber(5))
    println(isPerfectNumber(-1))
}