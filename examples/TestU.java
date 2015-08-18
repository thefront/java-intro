public class TestU {
  public static void main(String[] args) {
    int a[] = {11, 22, 33};
    a[1] = doubleIt(a[2]);
    System.out.println(a[1] + a[2]);
  }

  public static int doubleIt(int num) {
    return num*2;
  }
}
