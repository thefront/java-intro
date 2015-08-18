public class TestHeader {
  public static void main (String args[]) {
    int obsMales=6, obsFemales=18;
    double jP=.1;
    tigers(obsMales, obsFemales, jP);
    char result = larger(0);
    System.out.println(result);
  }
  public static void tigers(int males, int females, double scale) {
    double juveniles = (males + females) * scale;
    System.out.println("Adults: " + (males + females));
    System.out.println("juveniles: " + juveniles);
  }

  public static char larger (int number)

  {

    if (number > 0)

        return '+';

    else if (number < 0)

        return '-';

    return '0';

  }
}
