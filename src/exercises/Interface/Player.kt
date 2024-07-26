package exercises.Interface

class Player(
    private var name: String,
    private var hitPoints: Int,
    private var strength: Int
) : ISaveable {
    private var weapon: String = "Sword"

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

    fun getWeapon(): String = weapon
    fun setWeapon(value: String) {
        weapon = value
    }

    override fun write(): List<String>{
        return listOf(name, hitPoints.toString(), strength.toString(), weapon)
    }
    override fun read(list: List<String>) {
        if (list.isEmpty() || list.size != 4) return
        this.setName(list[0])
        this.setHitPoints(list[1].toInt())
        this.setStrength(list[2].toInt())
        this.setWeapon(list[3])
    }

    override fun toString(): String {
        return "Player{name='$name', hitPoints=$hitPoints, strength=$strength, weapon='$weapon'}"
    }
}