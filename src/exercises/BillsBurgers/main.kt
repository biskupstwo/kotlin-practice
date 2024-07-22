package exercises.BillsBurgers

fun main(){
    val hamburger = Hamburger("Basic", "Sausage", 3.56, "White")
    hamburger.addHamburgerAddition1("Tomato", 0.27)
    hamburger.addHamburgerAddition2("Lettuce", 0.75)
    hamburger.addHamburgerAddition3("Cheese", 1.13)
    println("Total Burger price is " + hamburger.itemizeHamburger())

    val healthyBurger = HealthyBurger("Bacon", 5.67)
    healthyBurger.addHamburgerAddition1("Egg", 5.43)
    healthyBurger.addHealthyAddition1("Lentils", 3.41)
    println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger())

    val db = DeluxeBurger()
    db.addHamburgerAddition3("Should not do this", 50.53)
    println("Total Deluxe Burger price is " + db.itemizeHamburger())

}