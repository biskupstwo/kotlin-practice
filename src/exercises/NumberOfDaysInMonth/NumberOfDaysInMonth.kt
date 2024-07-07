package exercises.NumberOfDaysInMonth

import exercises.LeapYearCalculator.isLeapYear

fun getDaysInMonth(month: Int, year: Int): Int{
    if (year < 0 || year > 9999) return -1
    val isYearLeap: Boolean = isLeapYear(year)

    val daysInMonth: Int = when(month){
        1 -> 31
        2 -> if (isYearLeap) 29 else 28
        3 -> 31
        4 -> 30
        5 -> 31
        6 -> 30
        7 -> 31
        8 -> 31
        9 -> 30
        10 -> 31
        11 -> 30
        12 -> 31
        else -> -1
    }
    return daysInMonth
}

fun main(){
    println(getDaysInMonth(1, 2020))
    println(getDaysInMonth(2, 2020))
    println(getDaysInMonth(2, 2018))
    println(getDaysInMonth(-1, 2020))
    println(getDaysInMonth(1, -2020))
}