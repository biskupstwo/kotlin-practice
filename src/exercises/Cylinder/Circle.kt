package exercises.Cylinder

open class Circle(
    var radius: Double
) {

    init {
        if (radius < 0) this.radius = 0.0
    }

    fun getArea(): Double = radius*radius*Math.PI
}