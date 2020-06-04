package extendableVendingMachine;

import vending.OverloadedVendingMachine;
import vending.Product;

public class ExtendableVendingMachine extends OverloadedVendingMachine {

    public ExtendableVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty) {
        super(softDrinkQty, saltySnackQty, chocolateQty);
    }


    @Override
    public void buy(Product product) {
        
        if(product instanceof Product){

            super.buy(product);

        }

    }


}


