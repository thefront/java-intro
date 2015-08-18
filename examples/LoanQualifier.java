import javax.swing.JOptionPane;  // Needed 4 JOptionPane class Code-listing 3-3

/**
   This program demonstrates a nested if statement.
*/

public class LoanQualifier {
  public static void main(String[] args) {
    double salary;        // Annual Salary
    double yearsOnJob;    // Years at current job
    String input;         // To hold string input

    // Get the user's annual salary
    input = JOptionPane.showInputDialog("Enter your annual Salary: ");
    salary = Double.parseDouble(input);

    // Get the user's annual salary
    input = JOptionPane.showInputDialog("Enter the number of years at your " +
                                        "current job: ");
    yearsOnJob = Double.parseDouble(input);

    // Determine whether the user qualifies for the load
    if (salary >= 30000) {
      if (yearsOnJob >= 2) {
        JOptionPane.showMessageDialog(null, "You qualify for the load.");
      }
      else {
        JOptionPane.showMessageDialog(null, "You must have been on your " +
                                            "current job for at least two " +
                                            "years to qualify.");
      }
    }
    else {
      JOptionPane.showMessageDialog(null, "You must earn at lease $30,000 " +
                                          "per year to qualify.");
    }

    System.exit(0);
  }
}
