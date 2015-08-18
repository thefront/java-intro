// This program will output an item's retail price.  This is calculated by
// taking an item's wholesale cost and it's markup percentage.
// Inputs: an item's wholesale cost and the markup percentage.
// Outputs: an item's retail price
// Written by: Richard Tzeng
// Last Dat Modified:  3/30/2015

import java.util.Scanner;        // Needed for the Scanner class
import java.text.DecimalFormat;  // needed for decimal formating

public class Hwk8WholeSale
{
  public static void main(String[] args)
  {
    double cost;   // wholesale cost of item
    double markUp; // mark up percentagle
    int getOut = 0;    // used to exit program

    // Create a scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    // display instructions
    System.out.println("This program will calculate the retail cost of and " +
                       "item.\nTo exit the program, enter -1 for cost and " +
                       "number for the mark up %.\n");

    // get the first set of price and percentagle
    System.out.print("Enter the item cost: ");
    cost = keyboard.nextDouble();

    // get percentage
    System.out.print("Enter the mark up percentage: ");
    markUp = keyboard.nextDouble();

    // loop to print different retail costs
    while (getOut != -1)
    {
      // define decimal format and calculate cost
      DecimalFormat retail = new DecimalFormat("#,##0.00");
      double total = calculateRetail(cost, markUp);
      //Double.parseDouble(total.format(total));

      // print result
      System.out.println("The item's retail cost is : " + 
                          Double.parseDouble(retail.format(total)) + "\n");

      // get the first set of price and percentagle
      System.out.print("Enter the item cost: ");
      cost = keyboard.nextDouble();

      // check cost value to exit or loop
      if (cost == -1)
      {
        getOut = -1;  // set getOut to exit program
        break;
      } 

      // get percentage
      System.out.print("Enter the mark up percentage: ");
      markUp = keyboard.nextDouble();
    }
  }

  /**
     This method calculates the retail cost of an item
     @param1 itemCost The wholesale cost
     @param2 percentUp The mark up percentage
     @return retailCost
  */
  public static double calculateRetail(double itemCost, double percentUp)
  {
    // define and the format to 2 decimals
    DecimalFormat dollar = new DecimalFormat("#.00");

    // calculate the reatail cost
    double retailCost = itemCost * ( 1.00 +  (percentUp / 100.00));
    System.out.println("retailCost");
    return retailCost;
  }
}
