import java.util.Scanner;  // Needed for the Scanner class Code-listing 3-2

/**
   This program demonstrates the if-else statement.
*/

public class Division {
  public static void main(String[] args) {
    double num1, num2;  // Division operands
    double quotient;    // Result of division

    // create a Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Get the first number
    System.out.print("Enter a number: ");
    num1 = keyboard.nextDouble();

    // Get the second number
    System.out.print("Enter another number: ");
    num2 = keyboard.nextDouble();

    if (num2 == 0) {
      System.out.println("Division by zero is not possible.");
      System.out.println("Please run the progarm again and ");
      System.out.println("enter a number other than zero.");
    }
    else
    {
      quotient = num1 / num2;
      System.out.print("The quotient of " + num1 + " divided by " + num2);
      System.out.println(" is " + quotient);
    }
  }
}
