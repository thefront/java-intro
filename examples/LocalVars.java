
// Code-listing 5-8
/**
   This program demonstrates that two methods may have local variables
   with the same name.
*/

public class LocalVars
{
  public static void main(String[] args)
  {
    texas();
    calif();
  }

  /**
     The texas method has a local variable named birds.
  */
  public static void texas()
  {
    int birds = 5000;

    System.out.println("in texas there are " + birds + " birds.");
  }

    /**
     The calif method has a local variable named birds.
  */
  public static void calif()
  {
    int birds = 3500;

    System.out.println("in calif there are " + birds + " birds.");
  }
}
