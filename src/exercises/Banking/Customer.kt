package exercises.Banking

class Customer (
    private var name: String,
    transaction: Double
){
    private val transactions: ArrayList<Double> = arrayListOf<Double>(transaction)

    fun getName(): String = name
    fun getTransactions(): ArrayList<Double> = transactions
    fun addTransaction(transaction: Double): Boolean = transactions.add(transaction)

    fun printTransactions(){
        val allTransactions: ArrayList<Double> = getTransactions()
        println("Transactions")
        for (i in allTransactions.indices){
            println("[${i+1}]  Amount ${allTransactions[i]}")
        }
    }
}