package exercises.MegaBytesConverter

const val oneMegaByte: Int = 1024

fun printMegaBytesAndKiloBytes(kiloBytes: Int){
    if (kiloBytes < 0){
        println("Invalid Value")
        return
    }
    val megaBytes: Int = kiloBytes/oneMegaByte
    val remainingKiloBytes: Int = kiloBytes%oneMegaByte
    println("$kiloBytes KB = $megaBytes MB and $remainingKiloBytes KB")
}

fun main(){
    printMegaBytesAndKiloBytes(2500)
    printMegaBytesAndKiloBytes(-1024)
    printMegaBytesAndKiloBytes(5000)
}