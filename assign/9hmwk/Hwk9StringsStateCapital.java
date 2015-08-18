// This program will request to input two characters that represent a Pacific
// costal state abbreviation code, and an integer called position. The program
// displays the full name of the Pacific coastal state and the capital. If the
// two characters do not represent a Pacific coastal state, it will display an
// error message that includes whether the number of characters that were
// entered is more than, less than or equal to the two that are required. The
// states should be CA, WA, OR, AK, and HI. 
//
// Inputs: 1) either upper or lower case, CA, WA, OR, AK or HI
//         2) an interger for character position
//
// Outputs: the state capital and whether the character position matches or not.
// Written by: Richard Tzeng
// Last Dat Modified:  4/6/2015

import java.util.Scanner;        // Needed for the Scanner class

public class Hwk9StringsStateCapital
{
  public static void main(String[] args)
  {
    String state;   // variable for state
    int position;   // variable for character position

    // Create a scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    // display instructions
    System.out.println("Please input the two letter state abbreviation " +
                       "and a character position number.");
    System.out.print("Choose a Pacific Coastal State from the following list:" +
                       "\nCA, WA, OR, AK, HI:  ");

    // store the keyboard input
    state = keyboard.nextLine();

    // test string length equals 2
    if (state.length() > 2)
    {
      System.out.println("ERROR, you entered a state that has greater than 2 " +
                         "characters.  Please run the program again.");
      System.exit(1);
    }

    if (state.length() < 2)
    {
      System.out.println("ERROR, you entered a state that has less than 2 " +
                         "characters.  Please run the program again.");
      System.exit(1);
    }

    // get the position
    System.out.print("Enter the item character position: ");
    position = keyboard.nextInt();

    // define full state name, state capital
    String fullStateName = stateName(state);
    String stateCapitalName = stateCapital(state);

    // define char position, need to -1 since position starts at 0
    char stateNameChar = fullStateName.charAt(position - 1);
    char capitalNameChar = stateCapitalName.charAt(position - 1);

    // test the charcter positions and return output
    if (stateNameChar == capitalNameChar)
    {
      System.out.println(stateCapitalName + ", " + fullStateName + 
                         " match on position " + position + ": " + stateNameChar);
    }
    else
    {
      System.out.println(stateCapitalName + ", " + fullStateName + 
                         " do not match on position " + position); 
    }
  }

  /**
    This method returns a states full name, exit whole program if not in list
    @param1 abbrName The 2 letter state abbreviation
    @return fullName
  */
  public static String stateName(String abbrName)
  {
    String fullName;  // define local variable

    // Use switch and case "to test and return the proper name
    switch (abbrName)
    {
      case "ak":
      case "AK":
        fullName = "Alaska";
        break;

      case "ca":
      case "CA":
        fullName = "California";
        break;

      case "hi":
      case "HI":
        fullName = "Hawaii";
        break;

      case "or":
      case "OR":
        fullName = "Oregon";
        break;

      case "wa":
      case "WA":
        fullName = "Washington";
        break;

      default:
        throw new IllegalArgumentException("Invalid state abbreviation: " + abbrName);
    }

    return fullName;
  }

  /**
    This method receives the abbreviation and returns the state capital.
    @param1 abbrName The abbreviated state name
    @return city
  */
  public static String stateCapital(String abbrName)
  {
    String city;  // define local variable

    // Use switch and case "to test and return the proper name
    switch (abbrName)
    {
      case "ak":
      case "AK":
        city = "Juneau";
        break;

      case "ca":
      case "CA":
        city = "Sacramento";
        break;

      case "hi":
      case "HI":
        city = "Honolulu";
        break;

      case "or":
      case "OR":
        city = "Salem";
        break;

      case "wa":
      case "WA":
        city = "Olympia";
        break;

      default:
        throw new IllegalArgumentException("Invalid state abbreviation: " + abbrName);
    }

    return city;
  }
}
