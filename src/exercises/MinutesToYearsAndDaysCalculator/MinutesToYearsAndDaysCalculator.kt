package exercises.MinutesToYearsAndDaysCalculator

const val oneHourInMinutes = 60
const val oneDayInMinutes = oneHourInMinutes*24
const val oneYearInMinutes = oneDayInMinutes*365

fun printYearsAndDays(minutes: Long) {
    val years = minutes / oneYearInMinutes
    val days = (minutes % oneYearInMinutes) / oneDayInMinutes
    if (minutes >= 0) println("$minutes min = $years y and $days d") else println("Invalid Value")
}

fun main(){
    printYearsAndDays(525600)
    printYearsAndDays(1051200)
    printYearsAndDays(561600)
    printYearsAndDays(-100000)
}