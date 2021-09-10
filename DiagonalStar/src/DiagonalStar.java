public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.printf((i == 1 || i == number ||
                        j == 1 || j == number ||
                        i == j || j == number - i + 1) ? "*" : " ");
            }
            System.out.println();
        }

    }
}
