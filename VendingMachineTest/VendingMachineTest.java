import org.junit.jupiter.api.Test;
import vending.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest{

    SoftDrink softDrink = new SoftDrink();
    Chocolate chocolate = new Chocolate();
    SaltySnack saltySnack = new SaltySnack();
    Product product = new Product();

    @Test
    public void shouldDescribeSoftDrink(){
        SoftDrink coke = new SoftDrink();
        coke.description();
        assertEquals("This is a SoftDrink", coke.description());
    }

   @Test
    public void shouldOverloadBuyStock(){
    SaltySnack saltySnack = new SaltySnack();
    OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(10,10,10);
 //   overloadedVendingMachine.buy(product); //       -3  of each.
    overloadedVendingMachine.buy(saltySnack);//     -1 saltySnacksQty.
   overloadedVendingMachine.buy(chocolate); //     -1 chocolateQty.
   overloadedVendingMachine.buy(softDrink); //     -1 softDrinkQty.

    assertEquals(9, overloadedVendingMachine.saltySnackQty);
    assertEquals(9, overloadedVendingMachine.chocolateQty);
    assertEquals(9, overloadedVendingMachine.softDrinkQty);
}
    @Test
    public void shouldGetStock(){
        SaltySnack saltySnack = new SaltySnack();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(10,10,10);
        //   overloadedVendingMachine.buy(product); //       -3  of each.
        overloadedVendingMachine.getStock(saltySnack);//     10 saltySnacksQty.
        overloadedVendingMachine.getStock(chocolate); //     10 chocolateQty.
        overloadedVendingMachine.getStock(softDrink); //     10 softDrinkQty.

        assertEquals(10, overloadedVendingMachine.saltySnackQty);
        assertEquals(10, overloadedVendingMachine.chocolateQty);
        assertEquals(10, overloadedVendingMachine.softDrinkQty);
    }
    @Test
    public void shouldAddStock(){
        SaltySnack saltySnack = new SaltySnack();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(10,10,10);
        //   overloadedVendingMachine.buy(product); //       -3  of each.
        overloadedVendingMachine.addStock(saltySnack);//     +1 saltySnacksQty.
        overloadedVendingMachine.addStock(chocolate); //     +1 chocolateQty.
        overloadedVendingMachine.addStock(softDrink); //     +1 softDrinkQty.

        assertEquals(11, overloadedVendingMachine.saltySnackQty);
        assertEquals(11, overloadedVendingMachine.chocolateQty);
        assertEquals(10, overloadedVendingMachine.softDrinkQty);
    }

    @Test
    public void shouldbuyBulkStock(){//underConstruction
        SaltySnack saltySnack = new SaltySnack();
        OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(10,10,10);
        //   overloadedVendingMachine.buy(product); //       -3  of each.
        overloadedVendingMachine.buyBulk(10, saltySnack);//     -4 saltySnacksQty.
        overloadedVendingMachine.buyBulk(10,chocolate); //     -10 chocolateQty.
        overloadedVendingMachine.buyBulk(6,softDrink); //     -6 softDrinkQty.

        assertEquals(0, overloadedVendingMachine.saltySnackQty);
        assertEquals(0, overloadedVendingMachine.chocolateQty);
        assertEquals(4, overloadedVendingMachine.softDrinkQty);
    }
@Test
public void shouldnotNegativeStock(){
   // SaltySnack saltySnack = new SaltySnack();
    OverloadedVendingMachine overloadedVendingMachine = new OverloadedVendingMachine(10,10,-1);
        overloadedVendingMachine.buy(chocolate);
    assertEquals(0 , overloadedVendingMachine.chocolateQty);
 }
}
