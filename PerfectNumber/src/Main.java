public class Main {
    public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));

        for (int i = 0; i < 100000; i++) {
            if (PerfectNumber.isPerfectNumber(i)) {
                System.out.println("Found perfect number: " + i);
            }
        }
    }
}
