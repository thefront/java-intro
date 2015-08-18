// This program chagnes and argument passed to a parameter using call by reference
import java.text.DecimalFormat;

public class CallTestByReference
{
  public static void main(String args[])
  {
    DecimalFormat money = new DecimalFormat("$0.00");
    System.out.println("money format: " + money.format(1234.56));
    changeIt(money);
    System.out.println("money noCents: " + money.format(1234.56));
    addPlus(money);
    System.out.println("money plus: " + money.format(1234.56));
    useNew(money);
    System.out.println("money new: " + money);
  }
  public static void changeIt(DecimalFormat noCents)
  {
    noCents.applyPattern(".");
  }
  public static void addPlus(DecimalFormat noCents)
  {
    noCents.setPositivePrefix("+");
  }
  public static void useNew(DecimalFormat noCents)
  {
    noCents = new DecimalFormat("#.000"); 
  }
}
