// This program calculates the same price of an  Code-listing 2-19
// item that is regularely prices at $59, with
// a 20 percent discount subtracted

public class Discount {
  public static void main(String[] args) {
    // variables to hold the regular price, the
    // amount of a discount, and the sale price
    double regularPrice = 59.0;
    double discount;
    double salePrice;

    // calculate the amount of a 20% discount
    discount = regularPrice * 0.2;

    // caluclate the sale price by subtracting
    // the discount from the regular price
    salePrice = regularPrice - discount;

    // display the results
    System.out.println("Regular Price: $" + regularPrice);
    System.out.println("Discount Amount: $" + discount);
    System.out.println("Sale Price: $" + salePrice);
  }
}
