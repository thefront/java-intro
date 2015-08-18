// This program changing a passes parameter using call by value
public class CallTestByValue
{
  public static void main(String args[])
  {
    int var1 = 1;
    System.out.println("var1 is " + var1);
    changeIt(var1);
    System.out.println("var1 is " + var1);

  }
  public static void  changeIt (int var2)
  {
    var2 = 2;
  }
}
