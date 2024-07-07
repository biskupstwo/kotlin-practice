package exercises.SumOdd

fun isOdd(number: Int): Boolean = number%2 != 0

fun sumOdd(start: Int, end: Int): Int{
    if (start < 0 || end < 0 || end < start) return -1
    if ((start == end) && isOdd(start)) return start
    var sum: Int = 0
    for (i in start..end){
        sum += if (isOdd(i)) i else 0
    }
    return sum
}

fun main(){
    println(sumOdd(1, 100))
    println(sumOdd(-1, 100))
    println(sumOdd(100, 100))
    println(sumOdd(13,13))
    println(sumOdd(100, -100))
    println(sumOdd(100, 1000))
}