package exercises.PoolArea

class Cuboid(width: Double, length: Double, height: Double) : Rectangle(width, length){
    var height: Double = if (height < 0) 0.0 else height

    fun getVolume(): Double = getArea()*height
}

fun main(){
    val rectangle = Rectangle(5.0, 10.0)
    println("rectangle.width= " + rectangle.width)
    println("rectangle.length= " + rectangle.length)
    println("rectangle.area= " + rectangle.getArea())
    val cuboid = Cuboid(5.0, 10.0, 5.0)
    println("cuboid.width= " + cuboid.width)
    println("cuboid.length= " + cuboid.length)
    println("cuboid.area= " + cuboid.getArea())
    println("cuboid.height= " + cuboid.height)
    println("cuboid.volume= " + cuboid.getVolume())
}