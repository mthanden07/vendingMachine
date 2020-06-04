
package vending;
import vending.Product;
public class Main {

    public static void main(String[] args) {

SoftDrink softDrink = new SoftDrink();
Chocolate chocolate = new Chocolate();
SaltySnack saltySnack = new SaltySnack();
Product product = new Product();

OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(3,0,2);



        overloadedVendingMachine.buy(saltySnack);
        overloadedVendingMachine.getStock(saltySnack);


    }
}
