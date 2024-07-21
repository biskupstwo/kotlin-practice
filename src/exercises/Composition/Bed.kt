package exercises.Composition

class Bed(
    private var style: String,
    private var pillows: Int,
    private var height: Int,
    private var sheets: Int,
    private var quilt: Int
){
    fun make() = println("Bed -> Making | ")
    fun getStyle(): String = this.style
    fun getPillows(): Int = this.pillows
    fun getHeight(): Int = this.height
    fun getSheets(): Int = this.sheets
    fun getQuilt(): Int = this.quilt
}