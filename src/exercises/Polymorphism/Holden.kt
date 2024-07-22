package exercises.Polymorphism

class Holden(cylinders: Int, name: String) : Car(cylinders, name){
    override fun startEngine(): String{
        return "Holden -> startEngine()"
    }
    override fun accelerate(): String = "Holden -> accelerate()"
    override fun brake(): String = "Holden -> brake()"
}

fun main(){
    val holden = Holden(6, "Holden Commodore")
    println(holden.startEngine())
    println(holden.accelerate())
    println(holden.brake())
}