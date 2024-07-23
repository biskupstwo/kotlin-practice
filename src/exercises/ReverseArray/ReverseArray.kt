package exercises.ReverseArray

import java.util.*

fun reverse(array: Array<Int>): Array<Int>{
    var reversed: Array<Int> = emptyArray<Int>()

    for (i in array.size-1 downTo 0 step 1){
        reversed += array[i]
    }
    return reversed
}

fun main(){
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Array: ${Arrays.toString(array)}")
    println("-------")
    val reversed: Array<Int> = reverse(array)
    println("Reversed: ${Arrays.toString(reversed)}")
}