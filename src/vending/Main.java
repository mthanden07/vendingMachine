package vending;
import vending.Product;
public class Main {

    public static void main(String[] args) {

SoftDrink softDrink = new SoftDrink();
Chocolate chocolate = new Chocolate();
SaltySnack saltySnack = new SaltySnack();
Product product = new Product();
OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(50,60,100);

overloadedVendingMachine.buy(product);
overloadedVendingMachine.getStock();
overloadedVendingMachine.addStock(product);

    }
}
