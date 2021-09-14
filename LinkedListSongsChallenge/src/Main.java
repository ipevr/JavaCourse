import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Song> playList = new LinkedList<>();
        ArrayList<Album> albumList = new ArrayList<>();

        Album albumMichaelJackson =  new Album("Michael Jackson");
        albumMichaelJackson.addSong(new Song("Billie Jean", "3:41"));
        albumMichaelJackson.addSong(new Song("Beat it", "2:45"));
        albumMichaelJackson.addSong(new Song("Thriller", "3:36"));
        albumMichaelJackson.addSong(new Song("Bad", "3:10"));

        Album albumElvisPresley = new Album("Elvis Presley");
        albumElvisPresley.addSong(new Song("Jailhouse Rock", "2:43"));
        albumElvisPresley.addSong(new Song("In the Ghetto", "2:46"));
        albumElvisPresley.addSong(new Song("Burning Love", "1:43"));

        albumList.add(albumMichaelJackson);
        albumList.add(albumElvisPresley);

        playList.add(albumElvisPresley.getSong("Jailhouse Rock"));
        playList.add(albumMichaelJackson.getSong("Billie Jean"));
        playList.add(albumElvisPresley.getSong("Burning Love"));
        playList.add(albumElvisPresley.getSong("I don't know"));

        boolean quit = false;

        ListIterator<Song> songIterator = playList.listIterator();
        while (!quit) {
            printOptions();
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 0:
                quit = true;
                break;
            case 1:

            }
        }
    }
}
