package exercises.WallArea

class Wall(
    _width: Double,
    _height: Double
){
    constructor() : this(0.0, 0.0)
    var width = _width
        set(value){
            if (value < 0.0) field = 0.0 else field = value
        }
    var height = _height
        set(value){
            if (value < 0.0) field = 0.0 else field = value
        }

    init {
        when{
            width < 0.0 -> width = 0.0
            height < 0.0 -> height = 0.0
        }
    }

    fun getArea(): Double = width*height
}

fun main(){
    val wall: Wall = Wall(5.0,4.0)
    println("area= ${wall.getArea()}")
    wall.height = -1.5
    println("width= ${wall.width}")
    println("height= ${wall.height}")
    println("area= ${wall.getArea()}")
}