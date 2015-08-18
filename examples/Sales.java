import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/** Code-listing 8-11
    This program gathers sales amounts for the week. It uses the SalesData
    class to disply the total, average, highest, and lowest sales amounts.
*/

public class Sales
{
  public static void main(String[] args)
  {
    final int ONE_WEEK = 7;    // number of elements

    // create an array to hold sales amounts for a week.
    double[] sales = new double[ONE_WEEK];

    // get the week's sales figures.
    getValues(sales);

    // create a SalesData object, intialized with the week's sales figures.
    SalesData week = new SalesData(sales);

    // create a DecimalFormat object.
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    // Display the total, average, hightes, and lowest sales amount for the week
    JOptionPane.showMessageDialog(null,
              "The total sales were $" +
              dollar.format(week.getTotal()) +
              "\nThe average sales were $" +
              dollar.format(week.getAverage()) +
              "\nThe hightest sales were $" +
              dollar.format(week.getHighest()) +
              "\nThe lowest sales were $" +
              dollar.format(week.getLowest()));

    System.exit(0);
  }

  /**
      The getValues method asks the user to enter sales amounts for each element
      of an array.
      @param array The array to sotre the values in.
  */
  private static void getValues(double[] array)
  {
    String input;       // To hold user input

    // Get sales for each day of the week.
    for (int i = 0; i < array.length; i++)
    {
      input = JOptionPane.showInputDialog("Enter the sales of the day " +
                (i + 1) + ".");
      array[i] = Double.parseDouble(input);
    }
  }
}