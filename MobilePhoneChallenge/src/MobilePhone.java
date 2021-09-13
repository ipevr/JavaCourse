import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        if (exists(contact.getName())) {
            System.out.println("Contact already exists");
            return;
        }

        contacts.add(contact);
        System.out.println("Added contact " + contact.getName());
    }

    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact #" + (i + 1) + ": ");
            System.out.println("Name: " + contacts.get(i).getName());
            System.out.println("Phone Number: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void modifyContact(Contact currentContact, Contact modifiedContact) {
        int index = findContact(currentContact);
        if (index >= 0) {
            modifyContact(index, modifiedContact);
            System.out.println("Contact " + currentContact.getName() + " has been modified.");
            System.out.println("Name: " + modifiedContact.getName());
            System.out.println("Phone number " + modifiedContact.getPhoneNumber());
        } else {
            System.out.println("The contact provided has not been found.");
        }
    }

    public void removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            removeContact(index);
            System.out.println("Contact " + contact.getName() + " has been removed.");
        } else {
            System.out.println("Contact " + contact.getName() + " has not been found. Nothing removed.");
        }
    }

    public Contact searchContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return contacts.get(index);
        }

        return null;
    }

    private boolean exists(String name) {
        return findContact(name) >= 0;
    }

    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    private void modifyContact(int index, Contact modifiedContact) {
        contacts.set(index, modifiedContact);
    }

    private void removeContact(int index) {
        contacts.remove(index);
    }

}
