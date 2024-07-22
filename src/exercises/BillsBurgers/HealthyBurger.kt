package exercises.BillsBurgers

class HealthyBurger(meat: String?, price: Double) : Hamburger("Healthy hamburger", meat!!, price, "Brown rye") {
    var healthyExtra1Name: String? = null
    var healthyExtra1Price: Double = 0.0
    var healthyExtra2Name: String? = null
    var healthyExtra2Price: Double = 0.0
    fun addHealthyAddition1(name: String?, price: Double) {
        this.healthyExtra1Name = name
        this.healthyExtra1Price = price
        println(String.format("Added %s for an extra %.2f", name, price))
    }

    fun addHealthyAddition2(name: String?, price: Double) {
        this.healthyExtra2Name = name
        this.healthyExtra2Price = price
        println(String.format("Added %s for an extra %.2f", name, price))
    }

    override fun itemizeHamburger(): Double {
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price + this.healthyExtra1Price + this.healthyExtra2Price
    }
}