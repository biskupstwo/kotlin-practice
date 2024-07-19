package exercises.CarpetCostCalculator

class Calculator(
    var floor: Floor,
    var carpet: Carpet
) {
    fun getTotalCost(): Double = this.floor.getArea()*this.carpet.getCost()
}


fun main(){
    var carpet = Carpet(3.5)
    var floor = Floor(2.75, 4.0)
    var calculator = Calculator(floor, carpet)
    println("total= " + calculator.getTotalCost())
    carpet = Carpet(1.5)
    floor = Floor(5.4, 4.5)
    calculator = Calculator(floor, carpet)
    println("total= " + calculator.getTotalCost())

}