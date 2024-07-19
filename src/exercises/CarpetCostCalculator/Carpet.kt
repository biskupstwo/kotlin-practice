package exercises.CarpetCostCalculator

class Carpet(
    private var cost: Double
){
    init {
        if (cost < 0.0) cost = 0.0
    }

    fun getCost(): Double = this.cost
}