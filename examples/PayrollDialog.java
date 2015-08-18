// This calculates your gross pay. Code-listing 1-1
// This is edited in Code-listing 2-29
// Inputs: payRate
// Outputs: salary
// Written by: Richard Tzeng
// Last Dat Modified:  02/04/2015

// import java.util.Scanner;  // Needed for the Scanner class

import javax.swing.JOptionPane; 

/**
    This program demonstrates using dialogs with JOptioinPane and convert
    strings to integers.
*/

public class PayrollDialog
{
    public static void main(String[] args)
    {
        String inputString;  // For reading input
        String name;         // To hold a name
        int hours;           // Hours worked
        double payRate;      // Hourly pay rate
        double grossPay;     // Gross pay

        // Get the user's name
        name = JOptionPane.showInputDialog("What is your name? ");

        // Get the number of hours worked this week.
        inputString = JOptionPane.showInputDialog("How many hours did you " +
                                                  " work this week? ");

        // Convert the hours into integer
        hours = Integer.parseInt(inputString);

        // Get the user's hourly pay rate.
        inputString = JOptionPane.showInputDialog("What is your hourly " +
                                                  " pay rate? ");

        // Convert the pay rate into double
        payRate = Double.parseDouble(inputString);

        // Calculate the gross pay.
        grossPay = hours * payRate;

        // Display the resulting information.
        JOptionPane.showMessageDialog(null, "Hello " + name +
                        ". Your gross pay is $" + grossPay);

        // End the program
        System.exit(0);
    }
}
