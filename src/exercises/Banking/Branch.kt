package exercises.Banking

class Branch(
    private var name: String
) {
    private var customers: ArrayList<Customer> = arrayListOf<Customer>()

    fun getName(): String = name
    fun getCustomers(): ArrayList<Customer> = customers

    fun newCustomer(name: String, initialTransaction: Double): Boolean {
        if (findCustomer(name) != null) return false
        val customer: Customer = Customer(name, initialTransaction)
        return customers.add(customer)
    }

    fun addCustomerTransaction(name: String, transaction: Double): Boolean {
        val customer = findCustomer(name) ?: return false
        return customer.addTransaction(transaction)
    }

    fun findCustomer(name: String): Customer? {
        /*
        var result: Customer? = null
        for (customer in customers){
            if (customer.getName() == name){
                result = customer
                break
            }
        }
        return result
        */
        return customers.firstOrNull { it.getName() == name }
    }
}