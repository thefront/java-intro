// This is give an example of mixed expressions

public class MixedExpress {
  public static void main(String[] args) {

    // declare 1 byte, 1 integer and the results as integer, double 
    byte byte_num = 22;
    short short_num = 32750;
    int int_sum;
    double dub_sum, dub_sum2;

    // add the byte and short into an integer
    int_sum = byte_num + short_num;

    // add the byte and integer into a double
    dub_sum = byte_num + short_num;

    // add a decimal double with a byte will produce a double
    dub_sum2 = byte_num + dub_sum; 

    // print result of byte and short into integer 
    System.out.println("sum of byte and short 22 + 32750 = " + int_sum +
                       " which is an integer");

    // print result of byte and short into double 
    System.out.println("sum of byte and short 22 + 32750 = " + dub_sum +
                       " which is a decimal double");

    // print result of byte with decimal double
    System.out.println("sum of byte and double 22 + " + dub_sum + " = " +
                       dub_sum2 + " which is a decimal double");

  }
}
