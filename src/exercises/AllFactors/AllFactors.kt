package exercises.AllFactors

fun printFactors(number: Int){
    if (number < 1){
        println("Invalid Value")
        return
    }
    for (i in 1..number){
        if (number%i == 0){
            print("$i ")
        }
    }
    println()
}
fun main(){
    printFactors(6)
    printFactors(32)
    printFactors(10)
    printFactors(-1)
}