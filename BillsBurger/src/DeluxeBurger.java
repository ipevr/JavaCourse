public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String name, String breadRollType, boolean meat, int price) {
        super(name, breadRollType, meat, price, 2);
        super.setAddition1(new Addition("Chips", 9));
        super.setAddition2(new Addition("Drinks", 10));
    }
}
