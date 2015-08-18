// This program calculates butterfly population estimates
//   Inputs  : males,   estimated number of male butterflies
//             females, estimated number of female butterflies
//   Outputs : total butterflies, sex ratio, variance, gender difference,
//             mating pairs, growth factor, ratio factor, and potential
//             population.
// Written by: Richard Tzeng
//   Modified: Mar 23, 2015 
//
import java.util.Scanner;           // for command line inputs
import java.text.DecimalFormat;     // for decimal formating
import java.lang.*;                 // for math methods

public class Test
{
  public static void finalExam() {
    int aVar = 1;
    return;
  }
  public static char threeTest(int n, int d) {
    if (n < d)
      return ('P');
    return ('L');
  }
  public static void takeTwo(int num1, int num2) {
    System.out.println((num1 + num2)/2);
  }
  public static void main (String[] args)
  {
    String s;
    int three = 3 ;
    s = "01" + three; 
    System.out.println(s);
    double x = Math.sqrt(3 + 3.);
    int groupsize = 6;
    takeTwo(1, groupsize + 1);
    finalExam();
    System.out.println( threeTest (5,6) );
    int males, females;
    String str = "ding";
    String syn = "dong";
    System.out.println(str.compareTo(syn) >=2);
    System.out.println(syn.toUpperCase());
    System.out.println(syn.toLowerCase());
    String course = "Somatic Psycholoy";
    System.out.println(course.substring(0,1) + course.substring(8,9));

    // hwk3 assign variables for Gender Diff and mating pairs
    int genderDifference, matingPairs;
    int totalButterflies, sexRatio, ratioVariance;

    // define object for keyboard input
    Scanner stdin = new Scanner(System.in);

    System.out.println("\nButterfly Estimator\n");

    // get male population and store in males variable
    System.out.print("Enter the estimated males population: ");
    males = stdin.nextInt();

    // get female population and store in females variable
    System.out.print("Enter the estimated females population: ");
    females = stdin.nextInt();

    // calculations
    totalButterflies = males + females; 
    sexRatio         = males / females;
    ratioVariance    = males % females;
    genderDifference = males - females; // hwk3 addition for gender diff
    matingPairs      = males * females; // hwk3 addition for mating paires
    
    // OUTPUT
    System.out.println("\nTotal Butterflies    : " + totalButterflies );
    System.out.println("Sex Ratio            : " + sexRatio );
    System.out.println("Variance             : " + ratioVariance );

    // hwk3 addition for gender diff output
    System.out.println("Gender Difference    : " + genderDifference );

    // hwk3 addition for Mating Pairs
    System.out.println("Mating Pairs         : " + matingPairs );

    // hwk7 growth factor
    System.out.println("Growth Factor        : " + growthFactor(matingPairs));

    // hwk7 define ratio factor variable and output
    double ratioF = ratioFactor(sexRatio, growthFactor(matingPairs), ratioVariance); 
    System.out.println("Ratio Factor         : " + ratioF);

    // hwk7 potential population
    System.out.println("Potential Population : " + potentialPop(ratioF));
  }

  /**
     The growthFactor method takes the square root of the mating pairs.
     @param pairs The int maitingPairs value.
     @return gFactor The growth factor to 3 decimal digits
  */
  public static double growthFactor(int pairs)
  {
    // define format to 3 decimals
    DecimalFormat factor = new DecimalFormat("###.000");

    // calculate the growth factor
    double gFactor = Math.sqrt(pairs);

    // return the value
    return Double.parseDouble(factor.format(gFactor));
  }   

  /**
     The ratioFactor method divides the growth factor by the sex ratio, unless
     the sex ratio is zero. If the sex ratio is zero then the ratio factor is
     the square root of the ratio variance.
     @ param1 sRatio The integer sex ratio.
     @ param2 gFactor The double growthFactor.
     @ param3 rVariance The ratio variance
     @ return The ratioFactor to 1 decimal digit.
  */
  public static double ratioFactor(int sRatio, double gFactor, int rVariance)
  {
    // define the format to 1 decimal
    DecimalFormat factor = new DecimalFormat("###.0");
    double rFactor;  // define rFactor as a double

    // calculate the ratioFactor
    if (sRatio > 0)
      rFactor = gFactor / sRatio;
    else
      rFactor = Math.sqrt(rVariance);

    // return result
    return Double.parseDouble(factor.format(rFactor));
  }

  /**
     The potentialPop by raising 2 to the power of the ratio factor, after
     truncating the ratio factor to an integer.
     @param rFactor The ratio factor.
     @return The potential population.
  */
  public static int potentialPop(double rFactor)
  {
    // define potential variable and calculate potential population
    double potential = Math.pow(2, (int) rFactor);
    int pPop = (int) potential;

    // calculate the potential population and return value
    return pPop;
  }
}
