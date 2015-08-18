// Code listing 4-2
/**
   This program demonstrates the ++ and -- operators.
*/

public class Prefix {
  public static void main(String[] args) {
  	int number = 4;     // number starts out with 4

  	// display the value in number
  	System.out.println("number is " + number);
  	System.out.println("I will increment number");

  	// increment number
  	++number;

  	// display the value in number again.
  	System.out.println("Now, number is " + number);
  	System.out.println("I will decrement number.");

  	// decrement number.
  	--number;

  	// display the value in number once more.
  	System.out.println("Now, number is " + number);
  }
}
