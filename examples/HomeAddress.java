public class HomeAddress {
  private String street;   // street address
  private String city;     // city
  private String state;    // state
  private int zipCode;  // zip code

  public void setStreet(String s) {
    street = s;
  }

  public void setCity(String c) {
    city = c;
  }

  public void setState(String st) {
    state = st;
  }

  public void setZip(int z) {
    zipCode = z;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public int getZip() {
    return zipCode;
  }
}
