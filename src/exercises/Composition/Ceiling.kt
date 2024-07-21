package exercises.Composition

class Ceiling(
    private var height: Int,
    private var paintedColor: Int
){
    fun getHeight(): Int = this.height
    fun getPaintedColor(): Int = this.paintedColor
}