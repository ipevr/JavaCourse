public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 1;

        for (int i = 1; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                if (number % i == 0 && i > largestPrime){
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }

}
