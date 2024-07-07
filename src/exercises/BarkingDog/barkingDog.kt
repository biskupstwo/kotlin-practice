package exercises.BarkingDog

fun shouldWakeUp(isDogBarking: Boolean, hourOfDay: Int): Boolean{
    if (hourOfDay < 0 || hourOfDay > 23) return false
    return isDogBarking && (hourOfDay < 8 || hourOfDay >= 22)
}

fun main(){
    println(shouldWakeUp(true, 1))
    println(shouldWakeUp(false, 2))
    println(shouldWakeUp(true, 8))
    println(shouldWakeUp(true, -1))
}