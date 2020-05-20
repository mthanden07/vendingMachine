package vending;

public class Chocolate extends Product {
    public String description() {
        return "This is a Chocolate";
    }

    public void addStock(Chocolate chocolate) {
        chocolateQty++;
    }


    public void buy(Chocolate chocolate) {
        chocolateQty--;
        System.out.println("You have bought each of the 1 Chocolate ");
    }

    public int getStock(Chocolate chocolate) {
        return chocolateQty;
    }
}
