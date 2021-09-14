import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit,"London");
        addInOrder(placesToVisit,"New York");
        addInOrder(placesToVisit,"LA");
        addInOrder(placesToVisit,"Munich");
        addInOrder(placesToVisit,"Paris");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Rome");

        printList(placesToVisit);

        addInOrder(placesToVisit, "London");

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                // equal -> city already exists, do not add.
                System.out.println(newCity + " is already included as a destination");
                return false;
            }

            if (comparison > 0) {
                // new city should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }

            // move to next item as newCity does not match yet
        }

        // all comparisons < 0? Then it must be the last element.
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the list.");
            return;
        }

        System.out.println("Now visiting " + listIterator.next());
        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
            case 0:
                System.out.println("Holiday over.");
                quit = true;
                break;
            case 1:
                if (listIterator.hasNext()) {
                    if (!forward) {
                        listIterator.next();
                        forward = true;
                    }
                }
                if (listIterator.hasNext()) {
                    System.out.println("Now visiting " + listIterator.next());
                } else {
                    System.out.println("Reaches the end of the list.");
                    forward = false;
                }
                break;
            case 2:
                if (listIterator.hasPrevious()) {
                    if (forward) {
                        listIterator.previous();
                        forward = false;
                    }
                }
                if (listIterator.hasPrevious()) {
                    System.out.println("Now visiting " + listIterator.previous());
                } else {
                    System.out.println("Reaches the start of the list.");
                    forward = true;
                }
                break;
            case 3:
                printMenu();
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: ");
        System.out.println("\t0 - Quit");
        System.out.println("\t1 - Go to next city");
        System.out.println("\t2 - Go to previous city");
        System.out.println("\t3 - Print actions");
    }
}
