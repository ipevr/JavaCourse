public class Hamburger {

    private String name;
    private String breadRollType;
    private boolean meat;
    private int basePrice;
    private Addition addition1 = null;
    private Addition addition2 = null;
    private Addition addition3 = null;
    private Addition addition4 = null;
    private int addedItems = 0;
    private int allowedAdditions;

    public Hamburger(String name, String breadRollType, boolean meat, int basePrice, int allowedAdditions) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.allowedAdditions = allowedAdditions;
    }

    public void setAddition1(Addition addition) {
        if (!moreAdditionsAllowed()) {
            System.out.println("No more additions allowed");
            return;
        }
        if (addition1 == null) {
            addedItems++;
        }
        this.addition1 = addition;
    }

    public void setAddition2(Addition addition) {
        if (!moreAdditionsAllowed()) {
            System.out.println("No more additions allowed");
            return;
        }
        if (addition2 == null) {
            addedItems++;
        }
        this.addition2 = addition;
    }

    public void setAddition3(Addition addition) {
        if (!moreAdditionsAllowed()) {
            System.out.println("No more additions allowed");
            return;
        }
        if (addition3 == null) {
            addedItems++;
        }
        this.addition3 = addition;
    }

    public void setAddition4(Addition addition) {
        if (!moreAdditionsAllowed()) {
            System.out.println("No more additions allowed");
            return;
        }
        if (addition4 == null) {
            addedItems++;
        }
        this.addition4 = addition;
    }

    protected void addItem() {
        addedItems++;
    }

    protected boolean moreAdditionsAllowed() {
        return (addedItems < allowedAdditions);
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public int getTotalPrice() {
        int priceAddition1 = 0;
        int priceAddition2 = 0;
        int priceAddition3 = 0;
        int priceAddition4 = 0;
        if (this.addition1 != null) {
            priceAddition1 = this.addition1.getPrice();
            System.out.println("Addition 1 " + addition1.getName() + ", price: " + addition1.getPrice());
        }
        if (this.addition2 != null) {
            priceAddition2 = this.addition2.getPrice();
            System.out.println("Addition 2 " + addition2.getName() + ", price: " + addition2.getPrice());
        }
        if (this.addition3 != null) {
            priceAddition3 = this.addition3.getPrice();
            System.out.println("Addition 3 " + addition3.getName() + ", price: " + addition3.getPrice());
        }
        if (this.addition4 != null) {
            priceAddition4 = this.addition4.getPrice();
            System.out.println("Addition 4 " + addition4.getName() + ", price: " + addition4.getPrice());
        }

        return this.basePrice + priceAddition1 + priceAddition2 + priceAddition3 + priceAddition4;
    }
}
