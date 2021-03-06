import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 0:
                printInstructions();
                break;
            case 1:
                groceryList.printGroceryList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchForItem();
                break;
            case 6:
                processArrayList();
                break;
            case 7:
                quit = true;
                break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - Process array list.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem() {
        System.out.printf("Enter the name of the new item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.printf("Enter item to replace: ");
        String oldItem = scanner.nextLine();
        System.out.printf("Enter replacement item: ");
        String newItem  = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.printf("Enter item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.printf("Enter item name: ");
        String searchItem = scanner.nextLine();
        if (groceryList.itemExists(searchItem)) {
            System.out.println("Found " + searchItem + " in the grocery list.");
        } else {
            System.out.println(searchItem + " not in the grocery list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(groceryList.getGroceryList());

        ArrayList<String> nextList = new ArrayList<>(groceryList.getGroceryList());

        String[] newArray = new String[groceryList.getGroceryList().size()];
        newArray = groceryList.getGroceryList().toArray(newArray);
        System.out.println("Array: " + Arrays.toString(newArray));
    }
}
