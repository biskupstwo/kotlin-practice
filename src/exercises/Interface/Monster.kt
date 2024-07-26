package exercises.Interface

class Monster(
    internal var name: String,
    private var hitPoints: Int,
    private var strength: Int
) : ISaveable {

    fun getName(): String = name
    fun setName(value: String) {
        name = value
    }

    fun getHitPoints(): Int = hitPoints
    fun setHitPoints(value: Int) {
        if (value >= 0) {
            hitPoints = value
        }
    }

    fun getStrength(): Int = strength
    fun setStrength(value: Int) {
        if (value > 0) {
            strength = value
        }
    }


    override fun write(): List<String> {
        return listOf(name, hitPoints.toString(), strength.toString())
    }

    override fun read(list: List<String>) {
        if (list.isEmpty() || list.size != 3) return
        this.setName(list[0])
        this.setHitPoints(list[1].toInt())
        this.setStrength(list[2].toInt())
    }

    override fun toString(): String {
        return "Monster{name='$name', hitPoints=$hitPoints, strength=$strength}"
    }


}