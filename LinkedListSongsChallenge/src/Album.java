import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    String name;
    LinkedList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Song getSong(String title) {
        ListIterator<Song> songIterator = songs.listIterator();

        while (songIterator.hasNext()) {
            Song song = songIterator.next();
            if (song.getTitle() == title) {
                return song;
            }
        }

        System.out.println("Song with title " + title + " does not exist in album " + name);
        return null;
    }
}
