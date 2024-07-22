package exercises.Encapsulation

class Printer(
    tonerLevel: Int,
    private var duplex: Boolean
) {
    private var tonerLevel: Int = if (tonerLevel in 0..100) tonerLevel else -1
    private var pagesPrinted: Int = 0

    fun addToner(tonerAmount: Int): Int{
        val result: Int
        val result1 = if (tonerAmount > 0 && tonerAmount <= 100) tonerAmount else -1
        val result2 = if (this.tonerLevel + tonerAmount > 100) -1 else this.tonerLevel + tonerAmount

        if (result1 != -1 || result2 != -1) {
            this.tonerLevel = result2
            result = this.tonerLevel
        } else {
            result = -1
        }

        return result
    }

    fun printPages(pages: Int): Int {
        var pagesToPrint = pages

        if (this.duplex) println("Printing in duplex mode")
        pagesToPrint = if (duplex) pagesToPrint / 2 else pagesToPrint
        this.pagesPrinted += pagesToPrint

        return pagesToPrint
    }

    fun getPagesPrinted(): Int = pagesPrinted
}

fun main(){
    val printer = Printer(50, true)
    println(printer.addToner(50))
    println("initial page count = " + printer.getPagesPrinted())
    var pagesPrinted = printer.printPages(4)
    println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted())
    pagesPrinted = printer.printPages(2)
    println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted())

}