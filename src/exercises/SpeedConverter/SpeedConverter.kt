package exercises.SpeedConverter

const val kilometerToMile: Double = 0.6213711922

fun toMilesPerHour(kilometersPerHour: Double): Long {
    val result: Long = if (kilometersPerHour < 0) -1 else Math.round(kilometersPerHour*kilometerToMile)
    return result
}

fun printConversion (kilometersPerHour: Double){
    val result: String = if (toMilesPerHour(kilometersPerHour) >= 0) "$kilometersPerHour km/h = ${toMilesPerHour(kilometersPerHour)} mi/h" else "Invalid Value"
    println(result)
}

fun main(){
    printConversion(1.5)
    printConversion(10.25)
    printConversion(-5.6)
    printConversion(25.42)
    printConversion(75.114)
}