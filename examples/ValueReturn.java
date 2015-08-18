
// Code-listing 5-9
/**
   This program demonstrates a value-returning method
*/

public class ValueReturn
{
  public static void main(String[] args)
  {
    int total, value1 = 20, value2 = 40;

    // call the sum method, passing the t contents of value1 and value2 as
    // arguments.  Assing the return value to the total variable.
    total = sum(value1, value2);

    // Display the content of all these variables.
    System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);
  }

  /**
     The sum method returns the sum of it's two parameters.
     @param num1 The first number to be added.
     @param num2 The second number to be added.
     @return The sum of num1 and num2.

  */
  public static int sum(int num1, int num2)
  {
    int result;   // resule is a local variable

    // Assing the value of num1 + num2 to result.
    result = num1 + num2;

    // return the value in the result variable.
    return result;
  }
}
