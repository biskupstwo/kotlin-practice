package exercises.Composition

class Bedroom(
    private var name: String,
    private var wall1: Wall,
    private var wall2: Wall,
    private var wall3: Wall,
    private var wall4: Wall,
    private var ceiling: Ceiling,
    private var bed: Bed,
    private var lamp: Lamp
) {
    fun getLamp(): Lamp = this.lamp
    fun makeBed(){
        print("Bedroom -> Making bed | ")
        bed.make()
    }
}

fun main(){
    val wall1 = Wall("West")
    val wall2 = Wall("East")
    val wall3 = Wall("South")
    val wall4 = Wall("North")

    val ceiling = Ceiling(12, 55)

    val bed = Bed("Modern", 4, 3, 2, 1)

    val lamp = Lamp("Classic", false, 75)

    val bedRoom = Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp)
    bedRoom.makeBed()
    bedRoom.getLamp().turnOn()
}