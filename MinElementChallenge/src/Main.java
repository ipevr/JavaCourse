import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Type in the number of integers: ");
        int[] integers = MinimumElement.readElements(MinimumElement.readInteger());
        System.out.println("Your minimum number was: " + MinimumElement.findMin(integers));

    }

}
