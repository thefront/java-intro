
// Code-listing 5-4
/**
   This program demonstrates hierachical method calls
*/

public class DeepAndDeeper
{
  public static void main(String[] args)
  {
    System.out.println("I'm starting in main.");
    deep();
    System.out.println("Now I'm back in the main method.");
  }

  /**
     The deep method displays a message and then calls the deeper method
  */
  public static void deep()
  {
    System.out.println("I'm now in deep.");
    deeper();
    System.out.println("Now I'm back in deep.");
  }

  /**
     The deeper method displays a message
  */
  public static void deeper()
  {
    System.out.println("I'm now in deeper.");
  }
}
