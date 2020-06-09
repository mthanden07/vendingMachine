package extendableVendingMachine;

import vending.*;

public class ExtendableVendingMachine {

    public int softDrinkQty = 0;
    private int saltySnackQty = 0;
    private int chocolateQty = 0;
    protected int chocolateMuffinQty = 0;




    public ExtendableVendingMachine(int softDrinkQty, int saltySnackQty, int chocolateQty, int chocolateMuffinQty) {
    //    super();
        //super(softDrinkQty, saltySnackQty, chocolateQty);


        this.softDrinkQty = softDrinkQty;
        this.saltySnackQty = saltySnackQty;
        this.chocolateQty = chocolateQty;
        this.chocolateMuffinQty = chocolateMuffinQty;


    }

//buy method
   // @Override
    public int buy(Product product) {
      
        if (product instanceof SaltySnack) {
            if (saltySnackQty > 0) {
                saltySnackQty--;
                System.out.println("You have bought 1 Salty Snack. ");
            }
            else if(saltySnackQty<0){
                saltySnackQty = 0;
                System.out.println("No more Salty Snacks.");

            }
        }

        if (product instanceof SoftDrink) {
            if (softDrinkQty > 0) {
                softDrinkQty--;
                System.out.println("You have bought 1 Soft Drink.");
            } else if(softDrinkQty<0) {
                System.out.println("No more SoftDrink. ");
                softDrinkQty = 0;
            }
        }



        if (product instanceof Chocolate) {
            if (chocolateQty > 0) {
                chocolateQty--;
                System.out.println("You have bought 1 Chocolate.");
            } else if (chocolateQty < 0) {
                System.out.println("No more Chocolates.");
             return  chocolateQty = 0;


            }
        }


        if(product instanceof ChocolateMuffin) {
            if (chocolateMuffinQty > 0) {
                chocolateMuffinQty--;
                System.out.println("You have bought 1 Chocolate Muffin.");
            }


            else if (chocolateMuffinQty < 0) {
                System.out.println("No more Chocolate Muffin");
                return chocolateMuffinQty = 0;

            }
        }
        return 0;
    }


  //  add method
 //   @Override
    public void addStock(Product product) {

        if (product instanceof SaltySnack) {
            saltySnackQty += 3;
            System.out.println("You have added 3 Salty Snack. ");
        }

        if (product instanceof SoftDrink) {
            softDrinkQty += 3;
            System.out.println("You have added 3 Softy Drink. ");
        }
        if (product instanceof Chocolate) {
            chocolateQty += 3;
            System.out.println("You have added 3 Chocolate. ");
        }

    }














    // get method

    public int getStock(Product product) {

        if (product instanceof SaltySnack) {

              System.out.println(saltySnackQty + "  Salty Snacks left." );
              return this.saltySnackQty;

        }



       else if (product instanceof SoftDrink) {

               System.out.println(softDrinkQty + "  Soft Drinks drinks left.");
               return   this.softDrinkQty;

        }



       else if (product instanceof Chocolate) {
                System.out.println(chocolateQty + "  Chocolate left.  " );
                return chocolateQty;
        }



        else if(product instanceof ChocolateMuffin){
            System.out.println(chocolateMuffinQty + "  Chocolate Muffin left.");

            return chocolateMuffinQty;

        }

            else if (product instanceof Product) {
           // return softDrinkQty + chocolateQty + saltySnackQty;
           //    System.out.println("You have  " + this.saltySnackQty + " Salty Snack left.");
            //    System.out.println("You have  " + this.chocolateQty + " Chocolate left.");
             //   System.out.println("You have  " + this.softDrinkQty + " Soft Drinks left.");
               return 0;
            }
          return 0;
        }


public  void buyBulk(int more, Product product){

   if( more>0 && product instanceof SaltySnack) {
       if (saltySnackQty > 0) {
           saltySnackQty -= more;
           System.out.println("You have bought " + more + " Salty Snacks.");
       } else if (saltySnackQty < 0) {
           System.out.println("No more Salty Drink");
           softDrinkQty = 0;

       }
   }

        if( more > 0 && product instanceof SoftDrink) {
             if(softDrinkQty>0) {
                  softDrinkQty -= more;
                      System.out.println("You have bought " + more + " Soft Drinks.");
        }
        else if(softDrinkQty<0){
                    System.out.println("No more Soft Drink");
                    softDrinkQty = 0;
        }
    }

    if( more > 0 && product instanceof Chocolate) {
        if(chocolateQty>0) {
            chocolateQty -= more;
            System.out.println("You have bought " + more + " Chocolate.");
        }
        else if(chocolateQty<0){
            System.out.println("No more Chocolate");
            chocolateQty = 0;
        }
    }

    if( more > 0 && product instanceof ChocolateMuffin) {
        if (chocolateMuffinQty > 0) {
            chocolateMuffinQty -= more;
            System.out.println("You have bought " + more + " Chocolate Muffin. ");
        } else if (chocolateMuffinQty < 0) {
            System.out.println("No more Chocolate Muffin. ");
            chocolateMuffinQty = 0;
        }
    }

    }





/*
    public void buyBulkSaltySoftChocolate(int salty, int soft, int choco) {//......Buy all at once special method.
        saltySnackQty -= salty;
        softDrinkQty -= soft;
        chocolateQty -= choco;

        System.out.println("You have bought " + salty + " Salty Snacks.");
        System.out.println("You have bought " + soft + " Soft Drinks.");
        System.out.println("You have bought " + choco + " Chocolate.");
    }
*/

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


















}





