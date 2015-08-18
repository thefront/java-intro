// Code-listing 4-11
import java.util.Scanner;    // Need for the scanner class

/**
  this program calculates the total number of points a
  soccer team has earne over a series of a game. The user
  enters a serios of point values, then -1 when finised.
*/

public class SoccerPoints {
  public static void main(String[] args) {
    int points;             // game points
    int totalPoints = 0;    // Accumulator initialized to 0

    // creae a scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Display general instructions.
    System.out.println("Enter the number of points you team");
    System.out.println("has earned for each game this season.");
    System.out.println("Enter -1 when finished.");
    System.out.println();

    // Get the first number of points.
    System.out.println("Enter game points or -1 to end: ");
    points = keyboard.nextInt();

    // Accumulate the points until -1 is entered.
    while (points != -1) {
      // Add points to totalPoints
      totalPoints += points;

      // get the next number of points.
      System.out.print("Enter game points or -1 to end: ");
      points = keyboard.nextInt();
    }

    // Display the toatl number of points.
    System.out.println("The total points are " + totalPoints);

  }
}
