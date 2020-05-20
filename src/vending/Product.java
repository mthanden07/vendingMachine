package vending;

public class Product {

public int softDrinkQty = 0;
public int saltySnackQty = 0;
public int chocolateQty = 0;


    public String description() {
        return "This is a product";
    }
    public void addStock(Product product) {
        this.softDrinkQty++;
        this.chocolateQty++;
        this.saltySnackQty++;
    }

    public void buy(Product product) {
        this.softDrinkQty--;
        this.chocolateQty-


        this.saltySnackQty--;
        System.out.println("You have bought each of the 1 Soft Drink,  1 Chocolate and 1 Salty Snack ");
    }

    public int getStock() {
        return this.saltySnack

        Qty + this.saltySnackQty + this.chocolateQty;
    }
}



























