import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                break;
            }
        }

        long average = counter > 0 ? Math.round((double)sum / counter) : 0;

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
