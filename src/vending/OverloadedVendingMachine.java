package vending;

public class OverloadedVendingMachine {

    public int softDrinkQty = 0;
    public int saltySnackQty = 0;
    public int chocolateQty = 0;



    //  <===========================...loadingAdd();  ====================================>

    public void addStock(Product product) {
        
        this.softDrinkQty++;
        this.chocolateQty++;
        this.saltySnackQty++;
        System.out.println("You have added 3 of each products.");
    }

    public void addStock(Chocolate chocolate) {
        chocolateQty++;
        System.out.println("You have added 1 Chocolate.");
    }

    public void addStock(SaltySnack saltySnack) {
        saltySnackQty++;
        System.out.println("You have added 1 Salty Snack.");
    }

    public void addStock(SoftDrink softDrink) {
        softDrinkQty++;
        System.out.println("You have added 1 Soft Drink.");
    }

//    <==================================...addComplete(); ========================================>


    // <=================================...loadingBuy(); ========================================>


    public void buy(Product product) {
        this.softDrinkQty--;
        this.chocolateQty--;
        this.saltySnackQty--;
        System.out.println("You have bought 1 Soft Drink, 1 Chocolate and 1 Salty Snack ");
    }

    public void buy(SaltySnack saltySnack) {
        if (softDrinkQty >= 0 && saltySnackQty >= 0 && chocolateQty >= 0) {
            saltySnackQty--;
            System.out.println("You have bought 1 Salty Snack. ");
        }
    }

    public void buy(Chocolate chocolate) {
        chocolateQty--;
        System.out.println("You have bought each of the 1 Chocolate ");
    }

    public void buy(SoftDrink softDrink) {
        softDrinkQty--;
        System.out.println("You have bought 1 Soft Drink ");

    }

    //<===================...buyComplete();  ============================================>


    //<==========================...loadingGet();  =======================================>



    public void getStock(SoftDrink softDrink) {
        System.out.println("You have  " + softDrinkQty + "  Soft Drink left.");
    }

    public void getStock(SaltySnack saltySnack) {
        System.out.println("You have  " + saltySnackQty + "  Salty Snack left.");
    }

    public void getStock(Chocolate chocolate) {
        System.out.println("You have  " + chocolateQty + "  Chocolates left.");
    }

    public void getStock() {
        System.out.println("You have  " + this.softDrinkQty + " Soft Drink left.");
        System.out.println("You have  " + this.saltySnackQty + " Salty Snack left.");
        System.out.println("You have  " + this.chocolateQty + " Chocolate left.");

    }





//   <=============================...getComplete();  ===================================================>


    //<=============================...loadingBuyBulk();  ===============================================>




    public void buyBulk(int more, SaltySnack saltySnack) {
        saltySnackQty -= more;
        System.out.println("You have bought " + more + " Salty Snacks.");
    }

    public void buyBulk(int more, SoftDrink softDrink) {
        softDrinkQty -= more;
        System.out.println("You have bought " + more + " Soft Drinks.");
    }

    public void buyBulk(int more, Chocolate chocolate) {
        chocolateQty -= more;
        System.out.println("You have bought " + more + " Chocolate.");
    }

    public void buyBulkSaltySoftChocolate(int salty, int soft, int choco) {//......Buy all at once special method.
        saltySnackQty -= salty;
        softDrinkQty -= soft;
        chocolateQty -= choco;

        System.out.println("You have bought " + salty + " Salty Snacks.");
        System.out.println("You have bought " + soft + " Soft Drinks.");
        System.out.println("You have bought " + choco + " Chocolate.");
    }
    // ...<======================= ...buyBulkComplete();   ===========================================>


    // ...<======================...loadingAddBulk();  ======================================>


    public void addBulk(int more, SaltySnack saltySnack) {
        saltySnackQty += more;
        System.out.println("You have added " + more + " Salty Snacks.");
    }

    public void addBulk(int more, SoftDrink softDrink) {
        softDrinkQty += more;
        System.out.println("You have added " + more + " Soft Drinks.");
    }

    public void addBulk(int more, Chocolate chocolate) {
        chocolateQty += more;
        System.out.println("You have added " + more + " Chocolate.");
    }

    public void addBulkSaltySoftChocolate(int salty, int soft, int choco) {//......Buy all at once special method.
        saltySnackQty -= salty;
        softDrinkQty -= soft;
        chocolateQty -= choco;

        System.out.println("You have added " + salty + " Salty Snacks.");
        System.out.println("You have added " + soft + " Soft Drinks.");
        System.out.println("You have adede " + choco + " Chocolate.");
    }
    //<================================...addBulkComplete();  ====================================================>

    // <================================...loadingConstructor(); ===============================================>


    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty) {
        // set the stockLevel instance variables for each product in the constructor


            this.softDrinkQty = softDrinkQty; //OverloadedVendingMachine.getStock(softDrinkQty);
            this.chocolateQty = chocolateQty;
            this.saltySnackQty = saltySnackQty;


        // <===============================...constructorComplete();==========================================>
    }
}