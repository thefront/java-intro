// This program calculates butterfly population estimates
//   Inputs  : males,   estimated number of male butterflies
//             females, estimated number of female butterflies
//   Outputs : total butterflies, sex ratio, variance, gender difference
//             and mating pairs
// Written by: Richard Tzeng
//   Modified: Feb 8, 2015 
//
import java.util.Scanner;
public class Hwk3 {
  public static void main (String[] args) {
    int males, females;
    // hwk3 assign variables for Gender Diff and mating pairs
    int genderDifference, matingPairs;
    int totalButterflies, sexRatio, ratioVariance;
    Scanner stdin = new Scanner(System.in);

    System.out.println("\nButterfly Estimator\n");
    System.out.print("Enter the estimated males population: ");
    males = stdin.nextInt();
    System.out.print("Enter the estimated females population: ");
    females = stdin.nextInt();

    totalButterflies = males + females; 
    sexRatio         = males / females;
    ratioVariance    = males % females;
    genderDifference = males - females; // hwk3 addition for gender diff
    matingPairs      = males * females; // hwk3 addition for mating paires
    
    System.out.println("\nTotal Butterflies: " + totalButterflies );
    System.out.println("Sex Ratio        : " + sexRatio );
    System.out.println("Variance         : " + ratioVariance );

    // hwk3 addition for gender diff output
    System.out.println("Gender Difference: " + genderDifference );

    // hwk3 addition for Mating Pairs
    System.out.println("Mating Pairs     : " + matingPairs );
  }
}
