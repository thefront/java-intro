
// Code-listing 5-7
/**
   This program demonstrates that String arguments cannot be changed
*/

public class PassString
{
  public static void main(String[] args)
  {
    // Create a String object containing "Shakes"
    // the name variable references the object
    String name = "Shakes";
    
    // display the String referenced by the name variable.
    System.out.println("In main, the nmae is " + name);

    // call the changeName method, passing the contents of the name variable
    // as an argument

    changeName(name);

    // Display the String references by the name variable.
    System.out.println("Back in amin, the name is " + name);
  }

  /**
     The changeName method accepts a String as its argument and assigns the
     str parameter to a new string
  */
  public static void changeName(String str)
  {
    // create a string object containing "Dickens".
    // Assing it's address to the str parameter variable
    str = "Dickens";

    // Display the String referenced by str.
    System.out.println("In changeName, the name is now " + str);
  }
}
