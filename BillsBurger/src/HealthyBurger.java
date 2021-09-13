public class HealthyBurger extends Hamburger {

    private Addition addition5 = null;
    private Addition addition6 = null;

    public HealthyBurger(String name, int price) {
        super(name, "brown rye bread roll", false, price, 6);
        super.setAddition1(new Addition("Tomato", 5));
        super.setAddition2(new Addition("Salad", 3));
        super.setAddition3(new Addition("Cucumber", 6));
        super.setAddition4(new Addition("Onion", 4));
    }

    public void setAddition5(Addition addition) {
        if (!super.moreAdditionsAllowed()) {
            System.out.println("No more additions allowed");
            return;
        }
        this.addition5 = addition;

        super.addItem();
    }

    public void setAddition6(Addition addition) {
        if (!super.moreAdditionsAllowed()) {
            System.out.println("No more additions allowed");
            return;
        }
        this.addition6 = addition;

        super.addItem();
    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

    @Override
    public int getTotalPrice() {
        int basePrice = super.getTotalPrice();
        int priceAddition5 = 0;
        int priceAddition6 = 0;
        if (this.addition5 != null) {
            priceAddition5 = this.addition5.getPrice();
            System.out.println("Addition 5 " + addition5.getName() + ", price: " + addition5.getPrice());
        }
        if (this.addition6 != null) {
            priceAddition6 = this.addition6.getPrice();
            System.out.println("Addition 6 " + addition6.getName() + ", price: " + addition6.getPrice());
        }
        return basePrice + priceAddition5 + priceAddition6;
    }
}
