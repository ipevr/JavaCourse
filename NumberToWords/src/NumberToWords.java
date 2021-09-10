public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int numberOfDigits = getDigitCount(number);
        number = reverse(number);

        while (number > 0) {
            int digit = number % 10;
            numberOfDigits--;

            switch (digit) {
            case 0:
                System.out.printf("Zero ");
                break;
            case 1:
                System.out.printf("One ");
                break;
            case 2:
                System.out.printf("Two ");
                break;
            case 3:
                System.out.printf("Three ");
                break;
            case 4:
                System.out.printf("Four ");
                break;
            case 5:
                System.out.printf("Five ");
                break;
            case 6:
                System.out.printf("Six ");
                break;
            case 7:
                System.out.printf("Seven ");
                break;
            case 8:
                System.out.printf("Eight ");
                break;
            case 9:
                System.out.printf("Nine ");
                break;
            default:
                break;
            }


            number /= 10;
        }

        for (int i = 0; i < numberOfDigits; i++) {
            System.out.printf("Zero ");
        }

        System.out.println();
    }

    public static int reverse(int number) {
        int result = 0;
        int originalNumber = number;

        number *= number < 0 ? -1 : 1;

        while (number > 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }

        return result * (originalNumber < 0 ? -1 : 1);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

}
