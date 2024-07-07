package exercises.LeapYearCalculator

fun isLeapYear(year: Int): Boolean{
    if (year < 1 || year > 9999) return false
    var result = false
    if (year%4 == 0){
        if (year%100 == 0){
            if (year%400 == 0){
                result = true
            }
        }else{
            result = true
        }
    }
    return result
}

fun main(){
    println(isLeapYear(-1600))
    println(isLeapYear(1600))
    println(isLeapYear(2017))
    println(isLeapYear(2000))
    println(isLeapYear(2018))
    println(isLeapYear(2024))
}