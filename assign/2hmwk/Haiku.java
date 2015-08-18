//**********************************************************************
// Haiku.java  This program prints out a Haiku using 2 print statements
// inputs : none
// outputs : a haiku poem
// Written by : Richard Tzeng
// Last Modified : Jan 22 2015
//**********************************************************************

public class Haiku {
  public static void main (String[] args)  {
    // 2 print statements for the first line
    System.out.print("Lightning ");
    System.out.println("flash");

    // 2nd and 3rd lines using 1 print statement
    System.out.println("A frog jumps into the pond\n" + "Poem data flows");
  }
}
