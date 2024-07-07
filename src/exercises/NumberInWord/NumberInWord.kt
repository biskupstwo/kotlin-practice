package exercises.NumberInWord

fun printNumberInWord(number: Int){
    when (number){
        0 -> println("ZERO")
        1 -> println("ONE")
        2 -> println("TWO")
        3 -> println("THREE")
        4 -> println("FOUR")
        5 -> println("FIVE")
        6 -> println("SIX")
        7 -> println("SEVEN")
        8 -> println("EIGHT")
        9 -> println("NINE")
        else -> println("OTHER")
    }
}

fun main(){
    printNumberInWord(5)
    printNumberInWord(9)
    printNumberInWord(0)
    printNumberInWord(-1)
    printNumberInWord(10)
}