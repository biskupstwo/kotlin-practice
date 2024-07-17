package exercises.LargestPrime

fun getFactors(number: Int): List<Int>{
    if (number <= 0) return emptyList()
    val arrayOfFactors: MutableList<Int> = mutableListOf()
    for (i in 1..number) if (number%i == 0) arrayOfFactors.add(i)
    return arrayOfFactors
}

fun getLargestPrime(number: Int): Int{
    if (number <= 1) return -1
    var result: Int = 1
    val arrayOfFactors = getFactors(number)

    for (element in arrayOfFactors){
        var isPrime = true
        for (j in 2..Math.sqrt(element.toDouble()).toInt()){
            if (element%j == 0){
               isPrime = false
               break
            }
        }
        result = if (isPrime && element > result) element else result
    }

    return result
}

fun main(){
    println(getLargestPrime(21))
    println(getLargestPrime(217))
    println(getLargestPrime(0))
    println(getLargestPrime(45))
    println(getLargestPrime(-1))
    println(getLargestPrime(2))
}