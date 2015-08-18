/** Code-listing 8-4
   This program shows an array being intialized
*/
public class ArrayInitialization
{
  public static void main(String[] args)
  {
    int[] days = { 31, 28, 31, 30 };

    for (int index = 0; index < days.length; index++)
      System.out.println("Month " + (index + 1) + " has " + days[index] + " days.");
  }
}