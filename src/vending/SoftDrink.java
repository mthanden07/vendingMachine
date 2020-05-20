package vending;

public class SoftDrink extends Product {
//SoftDrink
    public String description() {
        return "This is a SoftDrink";
    }


    public void addStock(SoftDrink softDrink) {
        softDrinkQty++;
    }

    public void buy(SoftDrink softDrink) {
        softDrinkQty--;
        System.out.println("You have bought each of the 1 Soft Drink ");
    }

    public int getStock(SoftDrink softDrink) {
        return  softDrinkQty;
    }

}