package exercises.MinimumElement

import java.util.*

class MinimumElement {
    private var array: IntArray = IntArray(0)
    private var scanner: Scanner = Scanner(System.`in`)

    fun readInteger(){
        val size: Int = scanner.nextInt()
        array = IntArray(size)
    }
    fun readElements(){
        repeat(array.size){
            array[it] = scanner.nextInt()
        }
    }
    fun printArray() {
        for (i in 0..array.size-1) println("Element $i contents ${array[i]}")
    }

    fun findMin(): Int{
        var minValue: Int = array[0]
        for (element in array){
            if (element < minValue) minValue = element
        }
        return minValue
    }
}

fun main(){
    val minimumElement = MinimumElement()
    minimumElement.readInteger()
    minimumElement.readElements()
    minimumElement.printArray()
    println(minimumElement.findMin())
}