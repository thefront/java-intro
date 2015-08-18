// Code-listing 4-10
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
   This program calculates the running total.
*/

public class TotalSales {
  public static void main(String[] args) {
    int days;          // the number of days
    double sales;      // A days's sales figure
    double totalsales; // accumulator
    String input;      // to hold the user's input

    // create a Decimal Format object to format output
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    // Get the number of days.
    input = JOptionPane.showInputDialog("For how many days do you have sales figures?");

    days = Integer.parseInt(input);

    // Set the accumulator to 0
    totalsales = 0.0;

    // Get the sales figures and calculate a running total.
    for (int count = 1; count <= days; count++) {
      input = JOptionPane.showInputDialog("Enter the sales for day " + count + ":");
        sales = Double.parseDouble(input);
        totalsales += sales;      // add sales to totalsales.
        }

        // Display the total sales
        JOptionPane.showMessageDialog(null, "The total saleas are $" + dollar.format(totalsales));

        System.exit(0);
  }
}
