
package vending;
//
// import  java.lang.util.*;
//import org.w3c.dom.ls.LSOutput;

public class OverloadedVendingMachine {

    public int softDrinkQty = 0;
    public int saltySnackQty = 0;
    public int chocolateQty = 0;
  //  public int chocolateMuffinQty = 0;


    public static int noStock(){
        System.out.println("no moreStock");

        return 0;
    }

    // <================================...loadingConstructor(); ===============================================>


    public OverloadedVendingMachine(int softDrinkQty, int saltySnackQty,int chocolateQty) {
        // set the stockLevel instance variables for each product in the constructor
        if (this.saltySnackQty < 0) {
            System.out.println("Out of stock");
             saltySnackQty = 0;
        }
     /*
        this.softDrinkQty = softDrinkQty; //OverloadedVendingMachine.getStock(softDrinkQty);
        this.chocolateQty = chocolateQty;
        this.saltySnackQty = saltySnackQty;
        this.chocolateMuffinQty = chocolateMuffinQty;
      */
    }
        // <===============================...constructorComplete();==========================================>


    //  <===========================...loadingAdd();  ====================================>

    public void addStock(Product product) {
        //   if(softDrinkQty>=0 && softDrinkQty < 0) {

        this.softDrinkQty++;
        this.chocolateQty++;
        this.saltySnackQty++;
        System.out.println("You have added 3 of each products.");
    }
    //   else if(softDrinkQty<0){System.out.println("No more stock");}
    //   }

    public int addStock(Chocolate chocolate) {
        if (chocolateQty > 0) {
            chocolateQty++;
            System.out.println("You have added 1 Chocolate.");
        } else {
            return 0;
        }
        return 0;
    }

    public void addStock(SaltySnack saltySnack) {
        saltySnackQty++;
        System.out.println("You have added 1 Salty Snack.");
    }

    public void addStock(SoftDrink softDrink) {
        softDrinkQty++;
        System.out.println("You have added 1 Soft Drink.");
    }

/*   <==================================...addComplete(); ========================================>


      <=================================...loadingBuy(); ========================================>
*/

    public int buy(Product product) {
        if (softDrinkQty > 0 && saltySnackQty > 0 && chocolateQty > 0) {
             System.out.println("You have bought 1 Soft Drink, 1 Chocolate and 1 Salty Snack ");
            this.softDrinkQty--;
            this.saltySnackQty--;
            this.chocolateQty--;
        }
          else if(softDrinkQty < 0 && saltySnackQty < 0 && chocolateQty < 0){
            // System.out.println(" No more Stock " )
            softDrinkQty = 0;
        }
        // System.out.println("You have bought 1 Soft Drink, 1 Chocolate and 1 Salty Snack ");
        //  return 0;
        // else return 0;

        return 0;
    }

    public void buy(SaltySnack saltySnack) {
        if (softDrinkQty > 0) {
            saltySnackQty--;
            System.out.println("You have bought 1 Salty Snack. ");
        } else if (saltySnackQty <= 0) {
            System.out.println("No more stock");
        }
        //   return //"There is no Stock Try Again later" + null;
    }


    public void buy(Chocolate chocolate) {
        if (chocolateQty > 0) {
            chocolateQty--;
            System.out.println("You have bought 1 Chocolate ");
        } else if (chocolateQty < 0) {
            System.out.println("No more Chocolates");
            chocolateQty = 0;
        }
    }

    public void buy(SoftDrink softDrink) {

    if (softDrinkQty > 0) {
           softDrinkQty--;
    }
         System.out.println("You have bought 1 Soft Drink ");
        if(softDrinkQty<0) {

            softDrinkQty = 0;
        }
        System.out.println("No more Soft Drink");
     //   return softDrinkQty;
    }

    //<===================...buyComplete();  ============================================>


    //<==========================...loadingGet();  =======================================>


    public int getStock(SoftDrink softDrink) {
        if (softDrinkQty > 0) {
            System.out.println("You have  " + softDrinkQty + "  Soft Drink left.");
        } else if (softDrinkQty <= 0) {
            System.out.println("No more stock available !!!");
        }
        return softDrinkQty;
    }

    public int getStock(SaltySnack saltySnack) {
        if (saltySnackQty > 0) {
            System.out.println("You have  " + softDrinkQty + "  Soft Drink left.");
        } else if (saltySnackQty <= 0) {
            System.out.println("No more stock available !!!");
        }
        return saltySnackQty;
    }

    public int getStock(Chocolate chocolate) {
        if (chocolateQty > 0) {
            System.out.println("You have  " + chocolateQty + "  Soft Drink left.");
        } else if (chocolateQty <= 0) {
            System.out.println("No more stock available !!!");

        }
        return chocolateQty = 0;
    }

   /*

       public int getStock(ChocolateMuffin chocolateMuffin) {
           if (chocolateQty > 0) {
               System.out.println("You have  " + chocolateMuffinQty + "  Soft Drink left.");
           } else if (chocolateQty <= 0) {
               System.out.println("No more stock available !!!");

           }
           return chocolateQty = 0;
       }


     */

    public int getStock() {

        if (saltySnackQty > 0) {
            System.out.println("You have  " + this.saltySnackQty + " Salty Snack left.");
            return this.saltySnackQty;
        } else if (saltySnackQty <= 0) {
            System.out.println("You have no stock available !!!");
            return 0;
        }  if (softDrinkQty > 0) {
            System.out.println("You have  " + this.softDrinkQty + " Soft Drinks left.");
            return this.softDrinkQty;
        } else if (softDrinkQty <= 0) {
            return 0;
        } if (chocolateQty > 0) {
            System.out.println("You have  " + softDrinkQty + "  Soft Drink left.");
        } else if (chocolateQty <= 0) {
            System.out.println("No more stock available !!!");
        }
        return chocolateQty + softDrinkQty + saltySnackQty;
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
        System.out.println("You have added " + choco + " Chocolate.");
    }
    //<================================...addBulkComplete();  ====================================================>


    }




























