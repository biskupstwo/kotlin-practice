package exercises.Polymorphism

open class Car(
    private var cylinders: Int,
    private var name: String,
){
    private var engine: Boolean = true
    private var wheels: Int = 4

    open fun startEngine(): String{
        return "Car -> startEngine()"
    }
    open fun accelerate(): String = "Car -> accelerate()"
    open fun brake(): String = "Car -> brake()"
}

fun main(){
    val car = Car(8, "Base car")
    println(car.startEngine())
    println(car.accelerate())
    println(car.brake())

}