package exercises.EqualSumChecker

fun hasEqualSum(firstParameter: Int, secondParameter: Int, thirdParameter: Int): Boolean = firstParameter+secondParameter == thirdParameter

fun main(){
    println(hasEqualSum(1,1,1))
    println(hasEqualSum(1,1,2))
    println(hasEqualSum(1,-1,0))
}