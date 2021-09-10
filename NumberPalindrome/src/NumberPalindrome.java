public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        number *= number < 0 ? -1 : 1;

        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        reverse *= originalNumber < 0 ? -1 : 1;

//        System.out.println("Palindrome of " + originalNumber + " is " + reverse);
        return reverse == originalNumber;
    }
}
