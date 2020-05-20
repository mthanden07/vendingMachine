package vending;
import vending.Product;
public class Main {

    public static void main(String[] args) {

      //  Product product;
	// write your code here

       // Chocolate chocolate = new Chocolate();
       // System.out.println(chocolate.description());
        OverloadedVendingMachine spaza = new OverloadedVendingMachine(50,50,100);
          Product product = new Product();
        SaltySnack saltySnack = new SaltySnack();
        product.buy(new SaltySnack());

        System.out.println(product.getStock());
        System.out.println(product.getStock());

    }
}
