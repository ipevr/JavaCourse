import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printOptions();

        while (!quit) {
            System.out.printf("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 0:
                printOptions();
                break;
            case 1:
                printContactList();
                break;
            case 2:
                addContact();
                break;
            case 3:
                modifyContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                searchContact();
                break;
            case 6:
                quit = true;
                break;
            }
        }
    }

    private static void printOptions() {
        System.out.println("\nPress");
        System.out.println("\t0 - Print choice options");
        System.out.println("\t1 - Print list of contacts");
        System.out.println("\t2 - Add Contact");
        System.out.println("\t3 - Modify Contact");
        System.out.println("\t4 - Remove Contact");
        System.out.println("\t5 - Search / Find Contact");
        System.out.println("\t6 - Quit program");
    }

    private static void printContactList() {
        System.out.println("Print contact list");
        mobilePhone.printContacts();
    }

    private static void addContact() {
        System.out.println("Add a new contact");
        System.out.println("Enter the contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the contact phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        mobilePhone.addContact(contact);
    }

    private static void modifyContact() {
        System.out.println("Modify contact");
        System.out.println("Enter the name of the contact you want to modify: ");
        String name = scanner.nextLine();
        Contact currentContact = mobilePhone.searchContact(name);
        if (currentContact != null) {
            System.out.println("Enter the new name of the contact you want to modify: ");
            String newName = scanner.nextLine();
            System.out.println("Enter the new phone number of the contact you want to modify: ");
            String newPhoneNumber = scanner.nextLine();
            Contact modifiedContact = new Contact(newName, newPhoneNumber);
            mobilePhone.modifyContact(currentContact, modifiedContact);
        } else {
            printNameNotFound();
        }
    }

    private static void removeContact() {
        System.out.println("Remove contact");
        System.out.println("Enter the name of the contact you want to remove: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.searchContact(name);
        if (contact != null) {
            mobilePhone.removeContact(contact);
            System.out.println("Contact with name " + contact.getName() + " has been removed.");
        } else {
            printNameNotFound();
        }
    }

    private static void searchContact() {
        System.out.println("Search contact");
        System.out.printf("Enter the name of the contact you search: ");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.searchContact(name);
        if (contact != null) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number : " + contact.getPhoneNumber());
        } else {
            printNameNotFound();
        }

    }

    private static void printNameNotFound() {
        System.out.println("Sorry, the name you provided doesn't exist in the database.");
    }
}
