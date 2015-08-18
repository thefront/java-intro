// This program calculates the amount of pay that Code-listing 2-18
// will be contributed to a reitrement plan if 5%
// 7%, or 10% of monthly pay is withheld

public class Contribution {
  public static void main(String[] args) {
    // variables to hold the monthly pay and
    // the amount of contribution.
    double monthlyPay = 6000.0;
    double contribution;

    // calculate and display 5% contribution.
    contribution = monthlyPay * 0.05;
    System.out.println("5 percent is $" +
                       contribution +
                       " per month.");

    // calculate and display 8% contribution.
    contribution = monthlyPay * 0.08;
    System.out.println("8 percent is $" +
                       contribution +
                       " per month.");

    // calculate and display 10% contribution.
    contribution = monthlyPay * 0.10;
    System.out.println("10 percent is $" +
                       contribution +
                       " per month.");
  }
}
