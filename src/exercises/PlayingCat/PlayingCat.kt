package exercises.PlayingCat

fun isCatPlaying(summer: Boolean, temperature: Int): Boolean = (summer && (temperature >= 25 && temperature <= 45)) || (temperature >= 25 && temperature <= 35)

fun main(){
    println(isCatPlaying(true, 10))
    println(isCatPlaying(false, 36))
    println(isCatPlaying(false, 35))
    println(isCatPlaying(true, 45))
}