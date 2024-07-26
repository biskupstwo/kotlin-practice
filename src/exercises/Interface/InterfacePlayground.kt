package exercises.Interface

fun main(){
    val johnPlayer = Player("John", 20, 50)
    val johnBackup = johnPlayer.write()
    println(johnPlayer)
    johnPlayer.setName("Joe")
    johnPlayer.setHitPoints(400)
    println(johnPlayer)
    johnPlayer.read(johnBackup)
    println(johnPlayer)


    val werewolf = Monster("Werewolf", 20, 40)
    val werewolfBackup = werewolf.write()
    println(werewolf)
    werewolf.name = "Doge"
    println(werewolf)
    werewolf.read(werewolfBackup)
    println(werewolf)
}