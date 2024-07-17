package exercises.SharedDigit

fun hasSharedDigit(first: Int, second: Int): Boolean{
    if (first !in 10..99 || second !in 10..99) return false
    val result = first % 10 == second % 10 || first / 10 == second % 10 || first % 10 == second / 10 || first / 10 == second / 10
    return result
}

fun main(){
    println(hasSharedDigit(12, 23))
    println(hasSharedDigit(9, 99))
    println(hasSharedDigit(15, 55))
}
