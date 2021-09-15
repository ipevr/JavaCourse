import java.util.*;

public class Main {
    private static List<Album> albumList = new ArrayList<>();

    public static void main(String[] args) {
        List<Song> playList = new ArrayList<>();

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

        albumList.get(0).addToPlayList(1, playList);
        albumList.get(0).addToPlayList(3, playList);
        albumList.get(1).addToPlayList(1, playList);
        albumList.get(1).addToPlayList(3, playList);

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

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);

        ListIterator<Song> songIterator = playList.listIterator();
        boolean quit = false;
        boolean forward = true;
        printOptions();

        while (!quit) {
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Good Bye!");
                    quit = true;
                    break;
                case 1:
                    if (songIterator.hasNext()) {
                        if (!forward) {
                            songIterator.next();
                            forward = true;
                        }
                    }
                    if (songIterator.hasNext()) {
                        System.out.println("Now playing: " + songIterator.next().toString());
                    } else {
                        System.out.println("You are at the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if (songIterator.hasPrevious()) {
                        if (forward) {
                            songIterator.previous();
                            forward = false;
                        }
                    }
                    if (songIterator.hasPrevious()) {
                        System.out.println("Now playing: " + songIterator.previous().toString());
                    } else {
                        System.out.println("You are at the beginning of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (songIterator.hasPrevious()) {
                            System.out.println("Playing from start: " + songIterator.previous().toString());
                            songIterator.next();
                        } else {
                            System.out.println("You are at the beginning of the list");
                        }
                    } else {
                        if (songIterator.hasNext()) {
                            System.out.println("Playing from start: " + songIterator.next().toString());
                            songIterator.previous();
                        } else {
                            System.out.println("You are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Your list of songs in the playlist:");
                    listSongs(playList);
                    break;
                case 5:
                    if (forward) {
                        if (songIterator.hasPrevious()){
                            System.out.println(songIterator.previous().getTitle() + " has been removed from playlist.");
                            songIterator.remove();
                        } else {
                            System.out.println("Nothing is playing, I don't know what to remove.");
                        }
                    } else {
                        if (songIterator.hasNext()){
                            System.out.println(songIterator.next().getTitle() + " has been removed from playlist.");
                            songIterator.remove();
                        } else {
                            System.out.println("Nothing is playing, I don't know what to remove.");
                        }
                    }
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    private static void listSongs(List<Song> playList){
        ListIterator<Song> songIterator = playList.listIterator();
        int count = 1;

        while (songIterator.hasNext()) {
            System.out.println(count + ".: " + songIterator.next().toString());
            count++;
        }

    }


}
