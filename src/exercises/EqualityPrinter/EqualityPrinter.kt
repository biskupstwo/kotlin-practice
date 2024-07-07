package exercises.EqualityPrinter

fun printEqual(firstParameter: Int, secondParameter: Int, thirdParameter: Int){
    if (firstParameter < 0 || secondParameter < 0 || thirdParameter < 0){
        println("Invalid Value")
    }else if(firstParameter == secondParameter && secondParameter == thirdParameter){
        println("All numbers are equal")
    }else if(firstParameter != secondParameter && secondParameter != thirdParameter && firstParameter != thirdParameter){
        println("All numbers are different")
    }else{
        println("Neither all are equal or different")
    }
}

fun main(){
    printEqual(1, 1, 1)
    printEqual(1, 1, 2)
    printEqual(-1, -1, -1)
    printEqual(1, 2, 3)
    printEqual(-1, 1, 1)
    printEqual(1, -1, 1)
    printEqual(1, 1, -1)
}