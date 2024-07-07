package exercises.PositiveNegativeZero

fun checkNumber(number: Int){
    if (number > 0){
        println("positive")
    }else if(number < 0){
        println("negative")
    }else{
        println("zero")
    }
}

fun main(){
    checkNumber(2)
    checkNumber(0)
    checkNumber(-2)
}