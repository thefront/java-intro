import javax.swing.JOptionPane;  // Needed for JOptionPane Code-listing 3-6

/**
   This program asks the user to enter a numberic test
   score and displayas a letter grade for the score. The
   program uses nested decision structures
   to determine the grade.
*/

public class TrailingElse {
  public static void main(String[] args) {
    int testScore;   // Numeric test score
    String input;    // To hold the user's input

    // get the numeric test score
    input = JOptionPane.showInputDialog("Enter your numeric test score " +
                                        "and I will tell you the grade: ");
    testScore = Integer.parseInt(input);

    // Display the grade
    if (testScore < 60) 
      JOptionPane.showMessageDialog(null, "Your grade is F.");
    else if (testScore < 70)
      JOptionPane.showMessageDialog(null, "Your grade is D.");
    else if (testScore < 80)
      JOptionPane.showMessageDialog(null, "Your grade is C.");
    else if (testScore < 90)
      JOptionPane.showMessageDialog(null, "Your grade is B.");
    else if (testScore <= 100)
      JOptionPane.showMessageDialog(null, "Your grade is A.");
    else
      JOptionPane.showMessageDialog(null, "Invalid score.");

    System.exit(0);
  }
}
      
