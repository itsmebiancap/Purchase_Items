package Purchase_Items_v2;
 
import java.util.Scanner;
 
/**
 *
 * @author Bebe
 */
public class Purchase_Items_v2 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* For this week's assignment, you will build on your program from the Week
         * Two Individual Assignment, Accept User Input and Perform Calculations.
         * Specifically, you will add the capability using a loop to accept additional
         * information from your customer indefinitely until your customer indicates
         * that he or she is ready to see the purchase total by typing in a specific
         * exit value.
         */
 
        //Create a keyboard input object
        Scanner keyboard;
        keyboard = new Scanner(System.in);
 
        //Create the items name and item costs arrays
        String[] itemNames = {"Tennis Shoes", "Shirts", "Coats", "Belts", "Pants"};
        double[] itemCosts = {45, 89, 25.55, 15.00, 25.99};
 
        //variables for the financial calculations
        double totalAmount = 0.0;
        double taxRate = 0.081;
        double taxAmount = 0;
 
        //Discounts for large purchases
        double discountRate = 0.025;//2.5%
        double amountToQualifyForDiscount=100;
        double discountAmount = 0;
 
        //Displav items for sale on the console
        System.out.println("The following clothing items are available for purchase:");
        for(int i=0; i<itemNames.length; i++)
        {
            //Display each item in the array
            System.out.println(" "+ (i + 1)+". "+itemNames[i]+" for $" +
                    itemCosts[i] + " each");
        }
        System.out.println("");
 
        //Display on the console - ask for customer's name
        System.out.print("Please enter your name: ");
 
        //Get the customer name from the keyboard and store it in the String object
        // "customerName"
        String customerName;
        customerName = keyboard.next();
 
        //Display the customer's name and provide instructions
        System.out.println("\nOk, " + customerName + " please enter the product ID (the"
                + "number to the left of the items) that you wish to purchase. Enter"
                + " 0 when you are finished.\n");
 
        //Loop until the user enters 0
        int itemID = 0; //Set the condition to to 0
        int itemCounter; //No longer the loop condition counter, now used for the display.
        itemCounter = 1;
        do  //We're using a different type of loop structure now
        {
//Prompt the user
            System.out.print("Please enter item ID number." + itemCounter + 
                    "(enter 0 to exit): ");
            
            itemID = keyboard.nextInt();
            if(itemID != 0) {
                if(itemID > itemCosts.length)
                    continue;
                //Add to the total
                totalAmount = totalAmount + itemCosts[itemID - 1];
 
                //Increment the item display counter
                itemCounter++;
            }
        }
//If the user has not entered 0, then add the total
        while (itemID!=0);
 
        if(totalAmount>amountToQualifyForDiscount)
            discountAmount = totalAmount * discountRate;
 
        taxAmount = (totalAmount - discountAmount) * taxRate;
        double finalTotal = (totalAmount - discountAmount) + taxAmount;
        
//Calculate the taxes
 
//Display the results
            System.out.println("You selected " + itemCounter  + " items to purchase.");
            System.out.println("Your subtotal is " +totalAmount);
            System.out.println("Your discount amount is $" + discountAmount);
            System.out.println("Your sales tax is $" + taxAmount);
            System.out.println("The total amount due is $" + finalTotal);
// + taxAmount);
            System.out.println("");
 
 
    }
}