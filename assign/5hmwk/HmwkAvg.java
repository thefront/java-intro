// Write a program to calculate your homework average in this class. First input
// the number of assignments before inputting the homework values. Use a for 
// loop to read each homework value. The program will display the homework avg
// using the following equation:
//
//  homework average (percent) = (homework total / number of assignments) * 10
//
// Inputs: 4 9 8 9 10
//         1 8
//         0
//
// Outputs:  returns the homework average 
// Written by: Richard Tzeng
// Last Date Modified:  3/2/2015

// use java scanner class
import java.util.Scanner;

public class HmwkAvg {
  public static void main(String[] args) {
    int num_assign,    // the number of assignments
        grade,         // each assignment grade
        total_grades,  // accumulator
        hmwk_average;  // homework average

    // Create a scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Get the number of assignments
    System.out.println("How many homework assignments?");

    // assing keyboard input to variable
    num_assign = keyboard.nextInt();

    // Set the accumulator to 0
    total_grades = 0;

    // User for loop to get the grades and calculate total
    for (int count = 1; count <= num_assign; count++) {
      System.out.println("Enter grade for assignment " + count + ":");
      
      // assign input to variabel grade
      grade = keyboard.nextInt();

      // add grades up
      total_grades += grade;
    }

    // check to to see if total_grades is still 0, if it is, exit with error
    if (total_grades == 0) {
      System.out.println("Total grades entered is " + total_grades + 
                         ". Please re-enter your grades!");
    }
    else {
      // calculate the homework average
      hmwk_average = (total_grades / num_assign) * 10;

      // Display the homework average
      System.out.println("Your homework average is " + hmwk_average + ".");
    }
  }
}
