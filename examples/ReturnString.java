
// Code-listing 5-11
/**
   This program demonstrates a method that returns a reference to a String obj.
*/

public class ReturnString
{
  public static void main(String[] args)
  {
    String customerName;

    customerName = fullName("John", "Martin");
    System.out.println(customerName);
  }

  /**
     The fullName method accepts two string arguments containing a first and a
     last name.  It concatenates them into a single String object.
     @param first The first name.
     @param last The last name.
     @return A reference to a String object containing the first and last names.

  */
  public static String fullName(String first, String last)
  {
    String name;

    name = first + " " + last;
    return name;
  }
}
