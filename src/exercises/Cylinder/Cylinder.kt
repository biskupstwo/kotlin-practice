package exercises.Cylinder

class Cylinder(radius: Double, height: Double) : Circle(radius) {
    var height: Double = if (height < 0) 0.0 else height

    fun getVolume(): Double = getArea()*height
}

fun main(){
    val circle = Circle(3.75)
    println("circle.radius= " + circle.radius)
    println("circle.area= " + circle.getArea())
    val cylinder = Cylinder(5.55, 7.25)
    println("cylinder.radius= " + cylinder.radius)
    println("cylinder.height= " + cylinder.height)
    println("cylinder.area= " + cylinder.getArea())
    println("cylinder.volume= " + cylinder.getVolume())
}