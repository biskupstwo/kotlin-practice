package exercises.Polymorphism

class Mitsubishi(cylinders: Int, name: String) : Car(cylinders, name){
    override fun startEngine(): String{
        return "Mitsubishi -> startEngine()"
    }
    override fun accelerate(): String = "Mitsubishi -> accelerate()"
    override fun brake(): String = "Mitsubishi -> brake()"
}

fun main(){
    val mitsubishi = Mitsubishi(6, "Outlander VRX 4WD")
    println(mitsubishi.startEngine())
    println(mitsubishi.accelerate())
    println(mitsubishi.brake())
}