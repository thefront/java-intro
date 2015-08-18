public class TestAddress {
  public static void main(String[] args) {
    // create home address
    HomeAddress ccsf = new HomeAddress();

    ccsf.setStreet("50 Phelan Avenue");
    ccsf.setCity("San Francisco");
    ccsf.setState("CA");
    ccsf.setZip(94112);

    // print address
    System.out.println(ccsf.getStreet());
    System.out.println(ccsf.getCity() + ", " + ccsf.getState() + " " + 
                       ccsf.getZip());
  }
}
