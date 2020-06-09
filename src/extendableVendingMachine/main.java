package extendableVendingMachine;

import vending.*;

import vending.SaltySnack;

public  class main {
/*
    Product product = new Product();
    SaltySnack saltySnack = new SaltySnack();
    SoftDrink softDrink  = new SoftDrink();
    Chocolate chocolate = new Chocolate();


 */


    public static void main(String[] args) {


        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(-5, -3, -2,-1);
      //  vendingMachine.buy(new SaltySnack());



//OverloadedVendingMachine.noStock();


        //d   int check = vendingMachine.buy(saltySnack);
        //
        /*
        vendingMachine.buy(new SoftDrink());
        vendingMachine.buy(new SaltySnack());
         vendingMachine.buy(new Chocolate())   ;
             vendingMachine.buy(new ChocolateMuffin());


        vendingMachine.getStock(new SoftDrink());
         vendingMachine.getStock(new SaltySnack());
        vendingMachine.getStock(new Chocolate());
        vendingMachine.getStock(new ChocolateMuffin());


         */

     //   vendingMachine.addStock(new SaltySnack());
     //  vendingMachine.buyBulk(4,new SoftDrink());
       // System.out.println(vendingMachine.getStock(new SoftDrink()));

      //  System.out.println("helod");


OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(10,10,10);

overloadedVendingMachine.noStock();

    }
}