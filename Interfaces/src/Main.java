public class Main {
    public static void main(String[] args) {

        ITelephone ingosPhone;

        ingosPhone  = new DeskPhone(1234);
        ingosPhone.powerOn();
        ingosPhone.callPhone(1234);
        ingosPhone.answer();

        ingosPhone  = new MobilePhone(9876);
        ingosPhone.powerOn();
        ingosPhone.callPhone(9876);
        ingosPhone.answer();

    }
}
