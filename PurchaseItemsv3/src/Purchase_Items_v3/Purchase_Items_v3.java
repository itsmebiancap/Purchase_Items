package Purchase_Items_v2;

import java.util.Scanner;
/*
 *
 * @author Bianca Papapietro, PRG215, Professor Stott, 1/8/2017
 */
public class Purchase_Items_v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Constant for the total number of items for sale is 6
        final int Total_Items=6;
        
        //Create the items object arrays
        ItemsForSale[] items = new ItemsForSale[Total_Items];
        {
        //Loop an instantiate each object - you must always create the ind object
                    
        for (int i=0; i<Total_Items; i++)
        {
        
            items[i] = new ItemsForSale();
        }
   /* Use the PopulateItem method from the ItemsForSale class to insert 
   * the properties of each item object for sale
   */
     items[0].PopulateItem("1. Tennis Shoes", 45.89, true);
     items[1].PopulateItem("2. Shirts", 25.55, true);
     items[2].PopulateItem("3. Coats",89.99,true);
     items[3].PopulateItem("4. Belts", 15, true);
     items[4].PopulateItem("5. Pants",25.99,true);
     items[5].PopulateItem("6. Donation",10,false);
     
     //variables to for the financial calculations
     double totalAmount = 0.0;
     double totalTax= 0.0;
     final double taxRate = 0.081;
     
     //Discounts for large purchases
     final double Discount_Rate = 0.025;//2.5%
     final double Amount_To_Qualify_For_Discount = 100;
     double discountAmount = 0;
     
     //Display items for sale on the console
     System.out.println("The following clothing items are available for purchase: ");
        for (ItemsForSale item : items) {
            //Display each item in the array
            System.out.println((" ") + item.itemName + " for $" + item.itemCost + " each");
        }
     System.out.println("");
     
     
     //Create a new customer object
     Customer newCust = new Customer();
     
     //Display on the console - ask for the customer's first name
     System.out.println("Please enter your first name: ");
     
     /* Get the customer's first name from the keyboard and store it in the 
     * newCust object's.firstName property
     */
     newCust.firstName = keyboard.next();
     System.out.println("");
    
     //Display on the console - ask for the customer's first name
    System.out.println("Please enter your last name: ");
    
     /* Get the customer's last name from the keyboard and store it in the 
     * newCust object's.lastName property
     */
    newCust.lastName = keyboard.next();
    System.out.println("");
        
    newCust.fullName = newCust.firstName + " " + newCust.lastName;
    
    //Display the customer's full name (a method in the Customer class) and provide instructions
    System.out.println("Ok, " + newCust.fullName +", please enter the product ID"
            + "(number to the left of the item's name) that you wish to purchase."
            + " Enter 0 when you are finished.");
    
    //Loop until the user enters 0
    int itemID = 0; //Set the condition to 0
    int itemCounter; //No longer loop conditioncounter, now used for display
        itemCounter = 0;        
  
    do
    {
        //Prompt the user
       System.out.print("Please enter item ID number for purchase " +"(and enter 0 "
               + "to exit.): ");
       itemID = keyboard.nextInt();
       
       //Test the user did not enter the exit condition
       if(itemID>0)
       {
           //If the user has not enetered 0, then add to the total
           totalAmount = totalAmount + items[itemID-1].itemCost;
           
           //Moved tax calculation to hear since we might not charge tax on all items
           if(items[itemID-1].taxable==true)
           {
               totalTax = totalTax + (items[itemID - 1].itemCost * taxRate);
           }
           //Increment the item display counter
           itemCounter++;
       }
    } while(itemID != 0); //Check if exit condition has been met
    /* The loop is complete, calculate the discount and taxes and then display 
    * the results.
    */
    if(totalAmount >= Amount_To_Qualify_For_Discount)
    {
        discountAmount = totalAmount * Discount_Rate;
    }
    else
    {
        discountAmount=0;
    }
    //Display the results
    System.out.println("");
    System.out.println("You've selected " + itemCounter +" items to purchase.");
    System.out.println("Your discount amount is $" + discountAmount);
    System.out.println("You sales tax is $" + totalTax);
    System.out.println("The total anount due is $" + (totalAmount - discountAmount
            + totalTax));
    System.out.println("");
    
    }
    }
}

