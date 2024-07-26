package exercises.Playlist

class Song (
    private var title: String,
    private var duration: Double
){
    fun getTitle() = title
    override fun toString(): String {
        return "$title: $duration"
    }

}