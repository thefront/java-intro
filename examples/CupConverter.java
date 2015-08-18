// Code-listing 5-10
import javax.swing.JOptionPane;

/**
   The program converts cups to fluid ounces.
*/

public class CupConverter
{
  public static void main(String[] args)
  {
    double cups;    // To hold the number of cups
    double ounces;  // to hold the number of ounces

    // Get the number of cups.
    cups = getCups();

    // convert the cups to fluid ounces.
    ounces = cupsToOunces(cups);

    // Disply the results.
    displayResults(cups, ounces);
    System.exit(0);
  }

  /**
     The getCups method prompts the user to enter a number of cups.
     @return The number of cups entered by the user.
  */
  public static double getCups()
  {
    String input;    // to hold input.
    double numCups;  // to hold cups.

    // Get the number of cups from the user.
    input = JOptionPane.showInputDialog("This program converts measurements\n" +
            "in cups to fluid ounces. For your\nreference the formula is:\n" +
            "    1 cup = 8 fluid ounces\n\nEnter the number of cups.");

    // Convert the input to a double
    numCups = Double.parseDouble(input);

    // return the number of cups
    return numCups;
  }

  /**
     The cupsToOunces method converts a number of cups to fluid ounces, using
     the formula 1 cup = 8 fluid ounces.
     @param numCups The number of cups to convert.
     @return The number of ounces.
  */
  public static double cupsToOunces(double numCups)
  {
    return numCups * 8.0;
  }

  /**
     The displayResults method displays a message showing the results of the
     conversion.
     @param cups A number of cups.
     @param ounces A number of ounces.
  */
  public static void displayResults(double cups, double ounces)
  {
    // Display the number of ounces.
    JOptionPane.showMessageDialog(null, cups + " cups equals " + ounces + " fluid ounces.");
  }
}