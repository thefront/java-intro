// This program will ask the user to input a series of exam scores as integers.
// The number of scores is not limited. A sentinel value of -1 will be used to 
// terminate the input.  After termination of input, the program will print the
// number of scores entered and the largest and smallest score entered.
//
// Inputs: a series of exam scores
// Outputs:  number of scores entered and the largest and smallest scores 
// Written by: Richard Tzeng
// Last Date Modified:  3/9/2015

import java.util.Scanner;    // need for the scanner class

public class homeWork6 {
  public static void main(String[] args) {
    int score;           // inputed exam scores
    int numExams = 0;    // accumulator set to 0 for number of exams
    int highScore = 0;   // high score variable set to 0 to start
    int lowScore = 0;    // low score variable set to 0 to start

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

      // start adding up number of exams
      ++numExams;

      // if one exam entered, set high and low score to the first score entered
      if (numExams == 1) {
        lowScore = score;
        highScore = score;
      }

      // logic to determine high score
      if (score >= highScore) {
        highScore = score;
      }

      // logic to determine low score
      if (score <= lowScore) {
        lowScore = score;
      }

      // get the next exam score
      System.out.print("Enter exam score or -1 to end: ");
      score = keyboard.nextInt();
    }

    // display the number of exams, largest and smallest scores
    System.out.println("The total number of exams are " + numExams + ".");
    System.out.println("The largest score is " + highScore + ".");
    System.out.println("The smallest score is " + lowScore + ".");  
  }
}
