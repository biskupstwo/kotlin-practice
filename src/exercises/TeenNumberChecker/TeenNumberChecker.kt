package exercises.TeenNumberChecker

fun isTeen(parameter: Int): Boolean = parameter >= 13 && parameter <= 19

fun hasTeen(firstParameter: Int, secondParameter: Int, thirdParamater: Int): Boolean = isTeen(firstParameter) || isTeen(secondParameter) || isTeen(thirdParamater)

fun main(){
    println(isTeen(9))
    println(isTeen(13))
    println("--------------")
    println(hasTeen(9, 99, 19))
    println(hasTeen(23, 15, 42))
    println(hasTeen(22, 23, 24))
}