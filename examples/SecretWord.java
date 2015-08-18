// Code-listing 3-11

import java.util.Scanner; // needed fo the scanner class

/** 
   This program demonstrates a case insensitive string comparisson.
*/

public class SecretWord {
  public static void main(String[] args) {
    String input;    // to hole the user's input

    // Create a Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Prompt the user to enter the secret word
    System.out.print("Enter the secret word: ");
    input = keyboard.nextLine();

    // Determince whether the user entered the secret work
    if (input.equalsIgnoreCase("PROSPERO")) {
      System.out.println("Congratulations! You know the secret word!");
    }
    else {
      System.out.println("Sorry, that is NOT the secret word.");
    }
  }
}
