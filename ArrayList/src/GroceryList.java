import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position  = findItem(oldItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
            System.out.println("Grocery item " + oldItem + " has been modified to " + newItem + ".");
        }
    }

    private void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public void removeGroceryItem(String groceryItem) {
        int position = findItem(groceryItem);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public boolean itemExists(String item) {
        return findItem(item) >= 0;
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
