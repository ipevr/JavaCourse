import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration)
    {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        System.out.println("Song with title " + title + " already exists.");
        return false;
    }

    public Song getSong(String title) {
        Song song = findSong(title);
        if (song == null) {
            System.out.println("Song with title " + title + " does not exist in album " + name);
            return null;
        }
        return song;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index < songs.size())) {
            playList.add(songs.get(index));
            return true;
        }
        System.out.println("This album does not have a tracknumber " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, List<Song> playList) {
        Song song = findSong(songTitle);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("This album does not have a song with the title " + songTitle);
        return false;
    }

    private Song findSong(String title) {
        for (Song song: songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
}
