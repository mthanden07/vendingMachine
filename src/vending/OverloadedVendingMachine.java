package vending;
import  vending.Product;
import  vending.SoftDrink;
import vending.Chocolate;
import vending.SaltySnack;

public class OverloadedVendingMachine {
private int softDrinkQty = 0;
private int saltySnacksQty = 0;
private int chocolatesQty =0;





OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor

        this.softDrinkQty = OverloadedVendingMachine.getStock(softDrinkQty);
        this.chocolatesQty = chocolatesQty;
        this.saltySnacksQty = saltySnacksQty;


    }

    private static int getStock(int softDrinkQty) {
    return softDrinkQty;
    }
}
