
// Code-listing 5-5
/**
   This program demonstrates a method with a parameter.
*/

public class PassArg
{
  public static void main(String[] args)
  {
    int x = 10;
    System.out.println("I'm passing values to displayValues.");
    displayValues(5);                        // pass 5
    displayValues(x);                        // pass 10
    displayValues(x * 4);                    // pass 40
    displayValues(Integer.parseInt("700"));  // pass 700
    System.out.println("Now I'm back in the main method.");
  }

  /**
     The displayvalues method displays the value of its integer parameter (num)
  */
  public static void displayValues(int num)
  {
    System.out.println("The value is " + num);
  }
}
