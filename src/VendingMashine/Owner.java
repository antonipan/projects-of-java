package VendingMashine;

public class Owner extends Person {

    public Owner (String name, double purse) {
        super(name, purse);
    }

    @Override
    void setPurse (double purse) {
        this.purse = purse;
    }

    @Override
    void showListProducts(VendingAuto vending) {

    }

    /* Добавляет и удаляет продукты из машины*/
    public void addProduct (VendingAuto vending, Product product) {
        vending.addProductToVending(product);
    }
    public void removeProduct (VendingAuto vendingAuto, Product product) {
        vendingAuto.removeProductVending(product);
    }
    /*free cell */
    public void freeCell (VendingAuto vending) {
        vending.getFreeCell();
    }

}
