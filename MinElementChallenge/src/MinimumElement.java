import java.util.Scanner;

public class MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        return value;
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[count];

        System.out.println("Type in " + count + " integers:");
        for (int i = 0; i < count; i++) {
            integers[i] = scanner.nextInt();
        }

        scanner.close();
        return integers;
    }

    public static int findMin(int[] integers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
        }

        return min;
    }

}
