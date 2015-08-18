import java.util.Scanner;

public class TestingYou {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter value:");
    int side = keyboard.nextInt();
    printArea(10, side);
  }
  public static void printArea (int len, int wid) {
    System.out.println("Area is " + len * wid);
  }
}
