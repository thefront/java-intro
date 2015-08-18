/** Code-listing 8-5
    This program stores in ana array the hours worked by five empolyess
    who all make the same hourly wage
*/
import java.util.Scanner;

public class PayArray
{
  public static void main(String[] args)
  {
    final int EMPLOYEES = 5;    // number of employees
    double payRate;             // Hourly pay rate
    double grossPay;            // Gross Pay

    // create an array to hold employee hours.
    int[] hours = new int[EMPLOYEES];

    // Create a scanner object for keyboard input
    Scanner keyboard = new  Scanner(System.in);

    // Get the hours worked by each emplyee
    System.out.println("Enter the hours worked by " + EMPLOYEES +
                       " employees who all earn the same hourly rate.");

    for (int index = 0; index < EMPLOYEES; index++)
    {
      System.out.print("Employee #" + (index + 1) + ": ");
      hours[index] = keyboard.nextInt();
    }

    // Get the hoursly rate.
    System.out.print("Enter the hourly rate for each employee: ");
    payRate = keyboard.nextDouble();

    // Display each employee's gross pay
    System.out.println("Here is each employee's gross pay:");
    for (int index = 0; index < EMPLOYEES; index++)
    {
      grossPay = hours[index] * payRate;
      System.out.println("Employee #" + (index + 1) + ": $" + grossPay);
    }
  }
}