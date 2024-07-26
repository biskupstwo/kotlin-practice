package exercises.Playlist

import java.util.*


class Album (
    val name: String,
    val artist: String
){
    val songs: SongList = SongList(arrayListOf())
    // val songs: ArrayList<Song> = arrayListOf<Song>()
    inner class SongList(
        val songList: ArrayList<Song>
    ){
        fun add(song: Song): Boolean{

            return songList.add(song)
        }

        fun findSong(title: String): Song? {
            var result: Song? = null
            for (song in songList)
                if (song.getTitle() == title) {
                    result = song
                    break
                }
            return result
        }

        fun findSong(trackId: Int): Song? {
            if (trackId > songList.size-1) return null
            return songList[trackId]
        }

    }

    fun addSong(title: String, duration: Double): Boolean{
        val song: Song = Song(title, duration)
        return songs.add(song)
    }

    fun findSong(title: String): Song? {
        var result: Song? = null
        for (song in songs.songList)
            if (song.getTitle() == title) {
                result = song
                break
            }
        return result
    }

    fun addToPlayList(trackNumber: Int, playlist: LinkedList<Song>): Boolean{
        if (trackNumber-1 < 0 || trackNumber-1 >= songs.songList.size) return false
        val song: Song = songs.songList.get(trackNumber-1)
        return playlist.add(song)
    }

    fun addToPlayList(title: String, playlist: LinkedList<Song>): Boolean{
        val song: Song? = findSong(title)
        if (song == null) return false
        return playlist.add(song)
    }
}

fun main(){
    val albums = ArrayList<Album>()

    var album = Album("Stormbringer", "Deep Purple")
    album.addSong("Stormbringer", 4.6)
    album.addSong("Love don't mean a thing", 4.22)
    album.addSong("Holy man", 4.3)
    album.addSong("Hold on", 5.6)
    album.addSong("Lady double dealer", 3.21)
    album.addSong("You can't do it right", 6.23)
    album.addSong("High ball shooter", 4.27)
    album.addSong("The gypsy", 4.2)
    album.addSong("Soldier of fortune", 3.13)
    albums.add(album)

    album = Album("For those about to rock", "AC/DC")
    album.addSong("For those about to rock", 5.44)
    album.addSong("I put the finger on you", 3.25)
    album.addSong("Lets go", 3.45)
    album.addSong("Inject the venom", 3.33)
    album.addSong("Snowballed", 4.51)
    album.addSong("Evil walks", 3.45)
    album.addSong("C.O.D.", 5.25)
    album.addSong("Breaking the rules", 5.32)
    album.addSong("Night of the long knives", 5.12)
    albums.add(album)

    val playList = LinkedList<Song>()
    albums[0].addToPlayList("You can't do it right", playList)
    albums[0].addToPlayList("Holy man", playList)
    albums[0].addToPlayList("Speed king", playList) // Does not exist
    albums[0].addToPlayList(9, playList)
    albums[1].addToPlayList(3, playList)
    albums[1].addToPlayList(2, playList)
    albums[1].addToPlayList(24, playList) // There is no track 24
    println(playList)
}