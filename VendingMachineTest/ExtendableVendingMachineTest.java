import extendableVendingMachine.ChocolateMuffin;
import extendableVendingMachine.ExtendableVendingMachine;
import org.junit.jupiter.api.Test;
import vending.Chocolate;
import vending.Product;
import vending.SaltySnack;
import vending.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class
ExtendableVendingMachineTest {
    Chocolate chocolate = new Chocolate();
    ChocolateMuffin chocolateMuffin = new ChocolateMuffin();
    SaltySnack saltySnack =  new SaltySnack();
    SoftDrink softDrink = new SoftDrink();

    @Test
    public void ifCanBuyAndGetStock() {

        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(10, 10, 10, 10);

        vendingMachine.buy(new Chocolate());
        vendingMachine.getStock(new Chocolate());

        assertEquals(9, vendingMachine.getStock(new Chocolate()));


        vendingMachine.buy(new ChocolateMuffin());
        vendingMachine.getStock(new ChocolateMuffin());

        assertEquals(9, vendingMachine.getStock(new ChocolateMuffin()));


    }

    @Test
    public void ifNegativeStockBalance(){
        ExtendableVendingMachine vendingMachine = new ExtendableVendingMachine(-1, -2, -3, -4);

        vendingMachine.buy(new SaltySnack());
        assertEquals(0,vendingMachine.getStock(new SaltySnack()));


        vendingMachine.buy(new Chocolate());
        assertEquals(0,vendingMachine.getStock(new Chocolate()));

        vendingMachine.buy(new SoftDrink());
        assertEquals(0,vendingMachine.getStock(new SoftDrink()));


        vendingMachine.buy(new ChocolateMuffin());
        assertEquals(0,vendingMachine.getStock(new ChocolateMuffin()));

    }









}
