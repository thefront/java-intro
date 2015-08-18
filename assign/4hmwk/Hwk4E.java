// This program asks the user to input an integer number between 1 and 10.
// Then the program will print out the entered number in Roman numeral.
// If the number is out of the 1-10 range, an error will be printed.
// Inputs: integer number from user
// Outputs: Roman numeral translation of the inputed number
// Written by:  Richard Tzeng
// Last Dat Modified:  02/18/2015

import java.util.Scanner;  // needed for scanner class

public class Hwk4E {
  public static void main(String[] args) {
    int num;   // number entered by the user

    // create a Scanner object for input.
    Scanner input = new Scanner(System.in);

    // Get number between 1 and 10 from the user.
    System.out.print("Enter a number between 1 and 10: ");
    num = input.nextInt();

    // Determine the num entered and print the Roman numeral
    if (num == 1) {
      System.out.println("You entered I");
    }
    else if (num == 2) {
      System.out.println("You entered II");
    }
    else if (num == 3) {
      System.out.println("You entered III");
    }
    else if (num == 4) {
      System.out.println("You entered IV");
    }
    else if (num == 5) {
      System.out.println("You entered V");
    }
    else if (num == 6) {
      System.out.println("You entered VI");
    }
    else if (num == 7) {
      System.out.println("You entered VII");
    }
    else if (num == 8) {
      System.out.println("You entered VIII");
    }
    else if (num == 9) {
      System.out.println("You entered IX");
    }
    else if (num == 10) {
      System.out.println("You entered X");
    }
    else { 
      System.out.println("ERROR! That number is not between 1 and 10!");
    }
  }
}
