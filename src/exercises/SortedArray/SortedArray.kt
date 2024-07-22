package exercises.SortedArray

import java.util.Scanner

class SortedArray {
    private var array: IntArray = IntArray(0)
    private var scanner: Scanner = Scanner(System.`in`)

    fun getIntegers(size: Int){
        array = IntArray(size)
        repeat(size){
            array[it] = scanner.nextInt()
        }
    }
    fun printArray() {
        for (i in 0..array.size-1) println("Element $i contents ${array[i]}")
    }

    fun sortIntegers() = array.sortDescending()
}

fun main(){
    val sortedArray: SortedArray = SortedArray()
    sortedArray.getIntegers(5)
    sortedArray.printArray()
    sortedArray.sortIntegers()
    sortedArray.printArray()
}