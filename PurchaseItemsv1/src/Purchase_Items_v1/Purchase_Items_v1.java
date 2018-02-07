/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Purchase_Items_v1;

import java.util.Scanner;

/**
 *
 * @author Bianca Papapietro
 * University of Phoenix, Christopher Stott
 */
public class Purchase_Items_v1 {

    /**
     *For this week's assignment, you will build on your program from the Week 
     * One Individual Assignment, * "Hello, World!." Specifically, you will 
     * add the capability to accept additional user input (e.g., number of 
     * items a customer wants to purchase) and calculate a total sales amount,
     * including tax, based on net sales amount.
     * @param args
     */
    public static void main(String[] args) {
        // 
        //Create the cost of items to be sold
        
        //Display on the console - ask for customer's name
       Scanner keyboard = new Scanner(System.in); 
       System.out.println("Please enter your name");
//Create a keyboard input object
String customerName=keyboard.next();
//Get the customer name from keyboard and store it in the String object "customerName"
      
System.out.println("");
        
double tennisShoeCost = 45.89;
double shirtCost = 25.55;
double coatCost = 89.99;
double beltCost = 15.00;
double pantCost = 25.99;

//Variables to store financial information
double totalAmount = 0;
double taxRate;
        taxRate = 0.081;  
double taxAmount = 0;

System.out.println(customerName +", thank You! " + "The following clothing items are available for purchase.");
System.out.println("");
System.out.println("  1. Tennis Shoes for $"+tennisShoeCost+ " each");
System.out.println("  2. Shirts for $"+shirtCost+  " each");
System.out.println("  3. Coats for $"+coatCost+ " each");
System.out.println("  4. Belts for $"+beltCost+ " per pound");
System.out.println("  5. Pants for $"+beltCost+ " per pound");
System.out.println("");

//Ask the customer for how many items they wish to purchase - going to use this number for a loop and condition
System.out.println("How many of the above items do you wish to purchse?");
int itemsToPurchase;
        itemsToPurchase = keyboard.nextInt();

//Get the number of items from the keyboard
System.out.println("");

//Display the customer's nme and the number of items they wish to purchase on the console using println()
System.out.println("Ok, " + customerName + ",you wish to purchase " + itemsToPurchase + " items.");

//Instructions to the user
System.out.println("Please enter the product ID\" (that is the number to the left of the item's name) that you wish to purchse.");

int itemID = keyboard.nextInt();

//Loop the number of items the customer entered for the number of items 
for(int loopCounter = 1; loopCounter < itemsToPurchase; loopCounter++) 
{
//Promote user and get number from keyboard
System.out.print("Please enter the next Product ID" + (loopCounter + 1)+":"); 
    itemID = keyboard.nextInt();

}

//Test which item the user entered
//User entered 1
        if (itemID == 1)
        {
            totalAmount = +tennisShoeCost;
            System.out.println("The price for the tennis shoes are $"+tennisShoeCost+ " each");
        }

                 
//User entered 2
        else if (itemID == 2)
            {
                totalAmount = +shirtCost;
                System.out.println("The price for the tennis shoes are $"+shirtCost+ " each");
            }
//User entered 3
             if (itemID == 3)
             {
                totalAmount = +coatCost;
                System.out.println("The price for the coat is $"+coatCost+ " each");
             }  
//User entered 4
            if (itemID == 4)
            {
                totalAmount = +beltCost;
                System.out.println("The price for the belt is are $"+beltCost+ " each");
            }
//User entered 4
             if (itemID == 5)
             {                 
                totalAmount = +pantCost;
                System.out.println("The price for the pants are $"+pantCost+ " each");
             }
  

//The loop is complete, calculte the taxes and display the results
        
taxAmount = totalAmount*taxRate;

//Show results
System.out.println("");
System.out.println("Your sales total $" + totalAmount);
System.out.println("Your sales tax is $" + taxAmount);
System.out.println("The total amount due is $" + (totalAmount + taxAmount));
System.out.println("");

             }       
     }

