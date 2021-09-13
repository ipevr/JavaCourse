public class Main {

    public static void main(String[] args) {

        HealthyBurger healthyBurger = new HealthyBurger("The Healthy One", 8);
        healthyBurger.setAddition5(new Addition("Apple", 8));
        healthyBurger.setAddition6(new Addition("Pie", 7));
        System.out.println(healthyBurger.getTotalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe", "bread", true, 10);
        System.out.println(deluxeBurger.getTotalPrice());


    }
}
