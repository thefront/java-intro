// Code-listing 3-12

import javax.swing.JOptionPane;  // needed for JOptionPane

/**
   This program demonstrates how variables may be declared
   in various locations throughout a program.
*/

public class VariableScope {
  public static void main(String[] args) {
    // Get the user's first name
    String firstName;
    firstName = JOptionPane.showInputDialog("Enter your first name: ");

    // Get the user's Last name
    String lastName;
    lastName = JOptionPane.showInputDialog("Enter your last name: ");

    JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
    System.exit(0);
  }
}
