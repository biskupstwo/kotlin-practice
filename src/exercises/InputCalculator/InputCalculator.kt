package exercises.InputCalculator

import java.util.Scanner

fun inputThenPrintSumAndAverage(){
    var sum: Int = 0
    var count: Int = 0
    var input: Int
    val scanner = Scanner(System.`in`)

    while (scanner.hasNextInt()){
        input = scanner.nextInt()
        sum += input
        count++
    }

    val avg = if (count > 0) sum/count else 0

    println("SUM = $sum AVG = $avg")
}

fun main(){
    inputThenPrintSumAndAverage()
}