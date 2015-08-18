// This program will ask the user to input a series of exam scores as integers.
// The number of scores is not limited. A sentinel value of -1 will be used to
// terminate the input.  After termination of input, the program will print the
// total sum of scores entered.
//
// Inputs: a series of exam scores
// Outputs:  total sum of all exam scores
// Written by: Richard Tzeng
// Last Date Modified:  3/15/2015

import java.util.Scanner;    // need for the scanner class

public class Quest38 {
  public static void main(String[] args) {
    int score;           // inputed exam scores
    int totalScore = 0;    // total score variable set to 0

    // create a scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // display general instructions
    System.out.println("Enter each exam score.");
    System.out.println("Enter -1 when finished.");
    System.out.println();

    // get the first exam
    System.out.print("Enter exam score or -1 to end: ");
    score = keyboard.nextInt();

    // find the largest and smalles scores until -1 is entered
    while (score != -1) {

      //add the scores
      totalScore = totalScore + score;

      // get the next exam score
      System.out.print("Enter exam score or -1 to end: ");
      score = keyboard.nextInt();
    }

    // display the number of exams, largest and smallest scores
    System.out.println("The total scores: " + totalScore);
  }
}
