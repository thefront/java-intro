import java.util.Scanner;  // needed for the Scanner class

/*
  this program has a problem reading input
*/

public class Fourteen {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    int enroll = stdin.nextInt();
    while (enroll > 0) {
      System.out.print(enroll);
      enroll = stdin.nextInt();
    }

    System.out.println(enroll + 1);

  }
}
