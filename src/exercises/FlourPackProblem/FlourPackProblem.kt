package exercises.FlourPackProblem

fun canPack(bigCount: Int, smallCount: Int, goal: Int): Boolean {
    if (bigCount < 0 || smallCount < 0 || goal < 0) return false
    val sum = (bigCount*5)+smallCount
    val result: Boolean = sum == goal || (smallCount > 0 && goal-(bigCount*5)+1 == smallCount)
    return result
}

fun main(){
    println(canPack(1,0,4))
    println(canPack(1,0,5))
    println(canPack(0,5,4))
    println(canPack(2,2,11))
    println(canPack(-3,2,11))
}