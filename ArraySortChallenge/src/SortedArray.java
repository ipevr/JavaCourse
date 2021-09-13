import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int amount) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.printf("Type in number #" + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        scanner.close();
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] integers) {
        int[] sortedIntegers = Arrays.copyOf(integers, integers.length);

        for (int i = 0; i < sortedIntegers.length; i++) {
            for (int j = 0; j < sortedIntegers.length - 1; j++) {
                if (sortedIntegers[j] < sortedIntegers[j + 1]) {
                    int temp = sortedIntegers[j];
                    sortedIntegers[j] = sortedIntegers[j + 1];
                    sortedIntegers[j + 1] = temp;
                }
            }
        }

        return sortedIntegers;
    }

}
