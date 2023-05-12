package VendingMashine;

public class Buyer extends Person {
    public Buyer (String name, double purse) {
        super(name, purse);
    }

    @Override
    void setPurse(double purse) {
        System.out.println("You cannot change your purse");
    }

    @Override
    void showListProducts(VendingAuto vending) {

    }
}
