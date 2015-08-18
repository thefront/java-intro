// This program demonstrates a few of the String methods. Code-listing 2-22

public class StringMethods {
  public static void main(String[] args) {
    String message = "Jave is great fun!";
    String upper = message.toUpperCase();
    String lower = message.toLowerCase();
    char letter = message.charAt(2);
    int stringSize = message.length();

    System.out.println(message);
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(letter);
    System.out.println(stringSize);

    String composer = "Keith Richards";
    System.out.println(composer.substring(1,2) + 
                       composer.substring(7,8));
  }
}
