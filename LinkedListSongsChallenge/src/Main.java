import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Song> playList = new LinkedList<>();
        ArrayList<Album> albumList = new ArrayList<>();

        Album albumMichaelJackson =  new Album("Michael Jackson");
        albumMichaelJackson.addSong("Billie Jean", 3.41);
        albumMichaelJackson.addSong("Beat it", 2.45);
        albumMichaelJackson.addSong("Thriller", 3.36);
        albumMichaelJackson.addSong("Bad", 3.10);

        Album albumElvisPresley = new Album("Elvis Presley");
        albumElvisPresley.addSong("Jailhouse Rock", 2.43);
        albumElvisPresley.addSong("In the Ghetto", 2.46);
        albumElvisPresley.addSong("Burning Love", 1.43);

        albumList.add(albumMichaelJackson);
        albumList.add(albumElvisPresley);

        albumMichaelJackson.addToPlayList(1, playList);
        albumMichaelJackson.addToPlayList(3, playList);

        albumElvisPresley.addToPlayList(1, playList);
        albumElvisPresley.addToPlayList(3, playList);

        play(playList);
    }

    private static void printOptions() {
        System.out.println("\t0 - Quit");
        System.out.println("\t1 - Next Song");
        System.out.println("\t2 - Previous Song");
        System.out.println("\t3 - Replay current Song");
        System.out.println("\t4 - List songs");
        System.out.println("\t5 - Remove current song from playlist");
        System.out.println("\t6 - Print Options");
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);

        ListIterator<Song> songIterator = playList.listIterator();
        boolean quit = false;
        Song song = null;
        boolean forward = true;
        printOptions();

        while (!quit) {
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (songIterator.hasNext()) {
                        if (!forward) {
                            song = songIterator.next();
                            forward = true;
                        }
                    }
                    if (songIterator.hasNext()) {
                        song = songIterator.next();
                        System.out.println("Now playing: " + song.toString());
                    } else {
                        System.out.println("You are at the end of the list");
                        song = null;
                        forward = false;
                    }
                    break;
                case 2:
                    if (songIterator.hasPrevious()) {
                        if (forward) {
                            song = songIterator.previous();
                            forward = false;
                        }
                    }
                    if (songIterator.hasPrevious()) {
                        song = songIterator.previous();
                        System.out.println("Now playing: " + song.toString());
                    } else {
                        System.out.println("You are at the beginning of the list");
                        song = null;
                        forward = true;
                    }
                    break;
                case 3:
                    if (song == null) {
                        System.out.println("Nothing to replay at the moment");
                    } else {
                        System.out.println("Playing from start: " + song.toString());
                    }
                    break;
                case 4:
                    System.out.println("Your list of songs in the playlist:");
                    listSongs(playList);
                    break;
                case 5:
                    if (song != null) {
                        songIterator.remove();
                        System.out.println(song.getTitle() + " has been removed from playlist.");
                        song = null;
                    } else {
                        System.out.println("Nothing is playing, I don't know what to remove.");
                    }
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    private static void listSongs(LinkedList<Song> playList){
        ListIterator<Song> songIterator = playList.listIterator();
        int count = 1;

        while (songIterator.hasNext()) {
            Song song = songIterator.next();
            System.out.println(count + ".: " + song.toString());
            count++;
        }

    }


}
