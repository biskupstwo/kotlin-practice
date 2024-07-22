package exercises.BillsBurgers

class DeluxeBurger : Hamburger("Deluxe Hamburger", "Sausage & Bacon", 14.54, "White") {
    init {
        addition1Name = "Chips"
        addition1Price = 2.75
        println(java.lang.String.format("Added %s for an extra %.2f", addition1Name, addition1Price))
        addition2Name = "Drink"
        addition2Price = 1.81
        println(java.lang.String.format("Added %s for an extra %.2f", addition2Name, addition2Price))
    }

    override fun addHamburgerAddition1(name: String?, price: Double) {
        println("Cannot add additional items to a deluxe burger")
    }

    override fun addHamburgerAddition2(name: String?, price: Double) {
        println("Cannot add additional items to a deluxe burger")
    }

    override fun addHamburgerAddition3(name: String?, price: Double) {
        println("Cannot add additional items to a deluxe burger")
    }

    override fun addHamburgerAddition4(name: String?, price: Double) {
        println("Cannot add additional items to a deluxe burger")
    }

    override fun itemizeHamburger(): Double {
        return Math.round((price + addition1Price + addition2Price) * 100.0) / 100.0
    }
}