package exercises.Interface

interface ISaveable {
    fun write(): List<String>
    fun read(list: List<String>)
}