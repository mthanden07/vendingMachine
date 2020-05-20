package vending;

public class SaltySnack extends Product {
    public String description() {
        return "This is a SaltySnack";
    }





    public void addStock(SaltySnack saltySnack) {
        saltySnackQty++;
    }


    public void buy(SaltySnack saltySnack) {
        saltySnackQty--;
        System.out.println("You have bought each of the 1 Salty Snack ");
    }
    public int getStock(SaltySnack saltySnack) {
        return saltySnackQty;
    }
}
