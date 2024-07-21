package exercises.Composition

class Lamp(
    private var style: String,
    private var battery: Boolean,
    private var globRating: Int
){
    fun turnOn() = print("Lamp -> Turning on")
    fun getStyle(): String = this.style
    fun isBattery(): Boolean = this.battery
    fun getGlobRating(): Int = this.globRating
}