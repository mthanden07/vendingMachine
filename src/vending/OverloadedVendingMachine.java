package vending;

public class OverloadedVendingMachine {
   public int softDrinkQty = 0;
    public int saltySnackQty = 0;
    int chocolateQty = 0;


/*
    public int getStock(SoftDrink softDrinkQty) {
        return this.softDrinkQty;
    }
*/
    public void addStock(Product product) {
        this.softDrinkQty++;
        this.chocolateQty++;
        this.saltySnackQty++;
        System.out.println("You have added 3 of each products");
    }
    public void addStock(Chocolate chocolate) {
        chocolateQty++;
    }
    public void addStock(SaltySnack saltySnack) {
        saltySnackQty++;
    }
    public void addStock(SoftDrink softDrink) {
        softDrinkQty++;
    }

    public void buy(SaltySnack saltySnack) {
        saltySnackQty--;
        System.out.println("You have bought each of the 1 Salty Snack ");
    }


    public void buy(Product product) {
        this.softDrinkQty--;
        this.chocolateQty --;
        this.saltySnackQty--;
        System.out.println("You have bought 1 Soft Drink, 1 Chocolate and 1 Salty Snack ");
    }

    public void buy(Chocolate chocolate) {
        chocolateQty--;
        System.out.println("You have bought each of the 1 Chocolate ");
    }
    public void buy(SoftDrink softDrink) {
        softDrinkQty--;
        System.out.println("You have bought 1 Soft Drink ");
    }

    public void getStock(SoftDrink softDrink) {
        System.out.println("You have  " + softDrinkQty + "Soft Drink left.");
    }

    public void getStock(SaltySnack saltySnack) {
        System.out.println("You have  " + saltySnackQty + "Salty Snack left.");
    }

    public void getStock(Chocolate chocolate) {
        System.out.println("You have  " + chocolateQty + "left.");
    }
    public void getStock() {
        System.out.println("You have  " + softDrinkQty + " Soft Drink left.");
        System.out.println("You have  " + saltySnackQty + " Salty Snack left.");
        System.out.println("You have  " + chocolateQty + " Chocolate left.");
    }



    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor

        this.softDrinkQty = softDrinkQty; //OverloadedVendingMachine.getStock(softDrinkQty);
        this.chocolateQty = chocolatesQty;
        this.saltySnackQty = saltySnacksQty;

    }


}