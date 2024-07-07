package exercises.AreaCalculator

fun area(radius: Double): Double = if (radius >= 0) radius*radius*Math.PI else -1.0
fun area(x: Double, y: Double): Double = if (x >= 0 && y >= 0) x*y else -1.0

fun main(){
    println(area(5.0))
    println(area(-1.0))
    println(area(5.0, 4.0))
    println(area(-1.0, 4.0))
}