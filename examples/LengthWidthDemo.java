// Code-listing 6-5

/**
   This program demonstrates the Rectangle class's setLength, setWidth,
   getLength, and getWidth methods.
*/

public class LengthWidthDemo {
  public static void main(String[] args) {
    // Create a Rectangle object
    Rectangle box = new Rectangle();

    // Call the box object's setLenth method, passing 10.0 as an arg
    box.setLength(10.0);

    // Call the box object's setWidth method, passing 20.0 as an arg
    box.setWidth(20.0);

    // Display the object's length and width.
    System.out.println("The box's length is " + box.getLength());
    System.out.println("The box's width is " + box.getWidth());
  }
}
