public class DigitSum {

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int nextNumber = number % 10;
            sum += nextNumber;
            number /= 10;
        }

        return sum;
    }
}
