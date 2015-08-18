// This calculates your gross pay. Code-listing 1-1
// This is edited in Code-listing 2-29
// Inputs: payRate
// Outputs: salary
// Written by: Richard Tzeng
// Last Dat Modified:  02/04/2015

import java.util.Scanner;  // Needed for the Scanner class

/**
    This program demonstrates the scanner class.
*/

public class Payroll
{
    public static void main(String[] args)
    {
        String name;     // To hold a name
        int hours;       // Hours worked
        double payRate;  // Hourly pay rate
        double grossPay; // Gross pay

        // Create a scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's name
        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        // Get the number of hours worked this week.
        System.out.print("How many hours did yo work this week? ");
        hours = keyboard.nextInt();

        // Get the user's hourly pay rate.
        System.out.print("What is your hourly pay rate? ");
        payRate = keyboard.nextDouble();

        // Get the gross pay.
        grossPay = hours * payRate;

        // Display the resulting information.
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);
    }
}
