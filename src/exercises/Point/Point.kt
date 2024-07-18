package exercises.Point

class Point(
    _x: Int,
    _y: Int
)
{
    var x: Int = _x
    var y: Int = _y

    constructor(): this(0,0)
    fun distance(): Double = Math.sqrt((((0.0-this.x)*(0.0-this.x)) + ((0.0-this.y)*(0.0-this.y))))
    fun distance(xB: Int, yB: Int): Double = Math.sqrt((((xB-this.x)*(xB-this.x)) + ((yB-this.y)*(yB-this.y))).toDouble())
    fun distance(pointB: Point): Double = Math.sqrt((((pointB.x-this.x)*(pointB.x-this.x)) + ((pointB.y-this.y)*(pointB.y-this.y))).toDouble())
}

fun main(){
    val first = Point(6, 5)
    val second = Point(3, 1)
    println("distance(0,0)= " + first.distance())
    println("distance(second)= " + first.distance(second))
    println("distance(2,2)= " + first.distance(2, 2))
    val point = Point()
    println("distance()= " + point.distance())

}