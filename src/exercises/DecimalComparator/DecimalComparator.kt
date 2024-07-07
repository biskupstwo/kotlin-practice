package exercises.DecimalComparator

fun areEqualByThreeDecimalPlaces(firstParameter: Double, secondParameter: Double): Boolean = (firstParameter * 1000).toInt() == (secondParameter * 1000).toInt()

fun main(){
    println(areEqualByThreeDecimalPlaces(-3.1756, -3.175))
    println(areEqualByThreeDecimalPlaces(3.175, 3.176))
    println(areEqualByThreeDecimalPlaces(3.0, 3.0))
    println(areEqualByThreeDecimalPlaces(-3.123, 3.123))
}