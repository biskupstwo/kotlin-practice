package exercises.Polymorphism

class Ford(cylinders: Int, name: String) : Car(cylinders, name){
     override fun startEngine(): String{
         return "Ford -> startEngine()"
    }
    override fun accelerate(): String = "Ford -> accelerate()"
    override fun brake(): String = "Ford -> brake()"
}

fun main(){
    val ford = Ford(6, "Ford Falcon")
    println(ford.startEngine())
    println(ford.accelerate())
    println(ford.brake())

}