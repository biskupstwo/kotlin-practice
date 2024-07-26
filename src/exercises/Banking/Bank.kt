package exercises.Banking

class Bank (
    private var name: String
){
    private var branches: ArrayList<Branch> = arrayListOf()

    fun addBranch(name: String): Boolean {
        val branch: Branch? = findBranch(name)
        val newBranch: Branch = Branch(name)
        return if (branch == null) branches.add(newBranch) else false
    }

    fun addCustomer(nameOfBranch: String, nameOfCustomer: String, initialTransaction: Double): Boolean {
        val branch: Branch = findBranch(nameOfBranch) ?: return false
        if (branch.findCustomer(nameOfCustomer) != null) return false
        return branch.newCustomer(nameOfCustomer, initialTransaction)
    }

    fun addCustomerTransaction(nameOfBranch: String, nameOfCustomer: String, transaction: Double): Boolean {
        val branch: Branch = findBranch(nameOfBranch) ?: return false
        val customer: Customer = branch.findCustomer(nameOfCustomer) ?: return false
        return customer.addTransaction(transaction)
    }

    fun findBranch(name: String): Branch? {
        return branches.firstOrNull { it.getName() == name }
    }

    fun listCustomers(nameofBranch: String, printTransactions: Boolean): Boolean {
        val branch: Branch = findBranch(nameofBranch) ?: return false
        val customers = branch.getCustomers()
        println("Customer details for branch ${branch.getName()}")
        for (i in customers.indices){
            println("Customer: ${customers[i].getName()}[${i+1}]")
            if (printTransactions) customers[i].printTransactions()
        }
        return true
    }
}

fun main(){
    val bank = Bank("National Australia Bank")

    bank.addBranch("Adelaide")

    bank.addCustomer("Adelaide", "Tim", 50.05)
    bank.addCustomer("Adelaide", "Mike", 175.34)
    bank.addCustomer("Adelaide", "Percy", 220.12)

    bank.addCustomerTransaction("Adelaide", "Tim", 44.22)
    bank.addCustomerTransaction("Adelaide", "Tim", 12.44)
    bank.addCustomerTransaction("Adelaide", "Mike", 1.65)

    bank.listCustomers("Adelaide", true)
}