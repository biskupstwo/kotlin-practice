package exercises.GreatestCommonDivisor

fun getGreatestCommonDivisor(input1: Int, input2: Int): Int {
    if (input1 < 10 || input2 < 10) return -1
    var greatest: Int = 1
    var tmp: Int = 1

    while(tmp < input1 || tmp < input2){
        greatest = if (input1%tmp == 0 && input2%tmp == 0) tmp else greatest
        tmp++
    }

    return greatest
}

fun main(){
    println(getGreatestCommonDivisor(25, 15))
    println(getGreatestCommonDivisor(12, 30))
    println(getGreatestCommonDivisor(9, 18))
    println(getGreatestCommonDivisor(81, 153))
}