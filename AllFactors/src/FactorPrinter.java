public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.printf("1 ");
        for (int i = number / 2; i >= 1; i--) {
            if (number % i == 0){
                System.out.printf((number / i) + (i > 1 ? " " : ""));
            }
        }
        System.out.println("\n");
    }
}
