// Code-listing 5-12

import java.util.Scanner;          // For the Sanner class
import java.io.*;                  // For the file I/O classes
import java.text.DecimalFormat;    // For the DecimalFormat class
import javax.swing.JOptionPane;     // For the JOptionPane class

/**
   This program opens a file containing the sales amounts for 30 days. It
   calculates the sales amounts for 30 days.  It calculates and displays the
   total sales and average daily sales.
*/

public class SalesReport
{
  public static void main(String[] args) throws IOException
  {
    final int NUM_DAYS = 30;           // Number of days of sales
    String filename;                   // The name of the file to open
    double totalSales;                 // Total sales for period
    double averageSales;               // Average daily sales

    // Get the name of the file.
    filename = getFileName();

    // Get the total sales from the file.
    totalSales = getTotalSales(filename);

    // Calculate the average.
    averageSales = totalSales / NUM_DAYS;

    // Display the total and average.
    displayResults(totalSales, averageSales);

    System.exit(0);
  }

  /**
     The getFileName method prompts the user to enter the name of the file to
     open.
     @return A reference to a String object containd the name of the file.
  */
  public static String getFileName()
  {
    String  file;          // to hold the file name
    // Prompt the user to enter a file name.
    file = JOptionPane.showInputDialog("Enter the name of the file " +
                         "30 days of sales amounts.");

    // return the name
    return file;
  }

  /**
     The getTotalSales method opens a file and reads the daily sales amounts,
     accumulating the toatl. The total is returned.
     @param filename The name of the file to open.
     @return The total of the sales amounts.
  */
  public static double getTotalSales(String filename) throws IOException
  {
    double total = 0.0;            // Accumulator
    double sales;                  // A daily sales amount

    // Open the file.
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);

    // This loop processes the lines read from the file,
    // until the end of the file is encountered.
    while (inputFile.hasNext())
    {
      // Read a double from the file.
      sales = inputFile.nextDouble();

      // Add sales to the value already in total.
      total += sales;
    }

    // Clost the file.
    inputFile.close();

    // return the total sales.
    return total;
  }

  /**
     The displayResults methos displaes the total and average daily sales.
     @param total The total sales.
     @param avg The average daily sales.
  */
  public static void displayResults(double total, double avg)
  {
    // Create a DecimalFormat object capable of formattng a dollar amount.
    DecimalFormat dollar = new DecimalFormat("#,###.00");

    // Display the total and average sales.
    JOptionPane.showMessageDialog(null, "The total sales for the period is " +
                   "$" + dollar.format(total) + "\nThe average daily sales " +
                   "were $" + dollar.format(avg));
  }
}