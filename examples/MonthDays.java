/** Code-listing 8-15
    This program demonstrates an arracy of String objects.
*/

public class MonthDays
{
  public static void main(String[] args)
  {
    String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July",
                        "Aug", "Sept", "Oct", "Nov", "Dec" };

    int[] days = { 31, 28, 31, 30, 31, 30, 31,
                   31, 30, 31, 30, 31 };

    for (int index = 0; index < months.length ; index++)
    {
      System.out.println(months[index] + " has " + days[index] + " days.");
    }
  }
}