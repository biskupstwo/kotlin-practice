package exercises.PoolArea

open class Rectangle(
    width: Double,
    length: Double
){
    var width: Double = if (width < 0) 0.0 else width
    var length: Double = if (length < 0) 0.0 else length

    fun getArea(): Double = width*length
}