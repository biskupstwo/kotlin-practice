package exercises.BillsBurgers

open class Hamburger(var name: String, var meat: String, var price: Double, var breadRollType: String) {
    var addition1Name: String? = null
    var addition1Price: Double = 0.0
    var addition2Name: String? = null
    var addition2Price: Double = 0.0
    var addition3Name: String? = null
    var addition3Price: Double = 0.0
    var addition4Name: String? = null
    var addition4Price: Double = 0.0


    init {
        println(
            String.format(
                "%s on a %s roll with %s, price is %.2f",
                name,
                breadRollType,
                meat,
                price
            )
        )
    }

    open fun addHamburgerAddition1(name: String?, price: Double) {
        this.addition1Name = name
        this.addition1Price = price
        println(String.format("Added %s for an extra %.2f", name, price))
    }

    open fun addHamburgerAddition2(name: String?, price: Double) {
        this.addition2Name = name
        this.addition2Price = price
        println(String.format("Added %s for an extra %.2f", name, price))
    }

    open fun addHamburgerAddition3(name: String?, price: Double) {
        this.addition3Name = name
        this.addition3Price = price
        println(String.format("Added %s for an extra %.2f", name, price))
    }

    open fun addHamburgerAddition4(name: String?, price: Double) {
        this.addition4Name = name
        this.addition4Price = price
        println(String.format("Added %s for an extra %.2f", name, price))
    }

    open fun itemizeHamburger(): Double {
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price
    }
}
