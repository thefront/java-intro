// Write a program that reads up to 52 double values of weekly rainfall for a
// given city. The program then uses a method to input less than 52 values and
// returns the number entered, with the following header:
// public static int getRainData(double rainFall[])
//
// The program uses a method to calc the avg rainfall with the following header:
// public static double calcAverage(double rainFall[], int numWeeks)
//
// The output of the program displays all 52 rainfall values followed by the 
// amount above or below the average for each week. Finally, the program
// displays the smallest and largest rainfall values for the year.
//
// Inputs: a list of 52 numbers or less of rain fall
//
// Outputs: 1) display all 52 rainfall values followed by amount above or below
//          the average for each week.
//          2) display the smallest and largest rainfall values for the year.
//
// Written by: Richard Tzeng
// Last Dat Modified:  5/16/2015

import java.util.Scanner;                   // Needed for the Scanner class

public class Hwk11ArrayRainfall
{
  public static void main(String[] args)
  {
    final int WEEKS = 52;                   // set constant for array size
    double[] rain = new double[WEEKS];      // initialize rain fall array
    int element = 0;                        // elements of array
    double number, avgRain;                 // store input and average
    int rainWeeks;                          // number of rainy weeks 

    // create scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // instructions
    System.out.println("Enter up to 52 weekly rainfall statistics.\n" +
                       "To quit, enter 0 or a negative number.");
    System.out.println("Let's start! Enter rainfall: ");

    // loop to read values into array
    while (element < WEEKS)
    {
      // read the first number
      number = keyboard.nextDouble();
      
      // if 0 or neg, quit
      if (number <= 0)
      {
        break;
      }
      
      // otherwise assign number to array
      rain[element] = number;
      element++;
    }

    // assign # of weeks that had rain using getRainData method
    rainWeeks = getRainData(rain);

    // Display count of values entered
    System.out.println("You entered " + rainWeeks + " weeks of data.");

    avgRain = calcAverage(rain, rainWeeks); // Get average rain fall

    // Display all 52 values and if it was above or below the average
    for (int index = 0; index < rain.length; index++)
    {
      if (rain[index] > avgRain)
      {
        System.out.println(rain[index] + " is above the average of " +
                          avgRain + ".");
      }
      else if (rain[index] < avgRain)
      {
        System.out.println(rain[index] + " is below the average of " +
                          avgRain + ".");
      }
      else
      {
        System.out.println(rain[index] + " is equal to the average of " +
                          avgRain + ".");
      }
    }

    // Display highest and lowest rain fall values
    System.out.println("The highest rain fall for the year is " + calcHighest(rain));
    System.out.println("The lowest rain fall for the year is " + calcLowest(rain));
  }

  /**
      The getRainData method will receive a double array and return the number
      of weeks entered
      @param rainFall The A reference to the array.
  */
  public static int getRainData(double rainFall[])
  {
    int arrayCount = 0;  // initialize the count of values
    
    // loop to find count of inputed values--non zero values
    for (int index = 0; index < rainFall.length; index++)
    {
      if (rainFall[index] > 0)
        arrayCount++;
    }

    return arrayCount;
  }

  /**
    This method receives the abbreviation and returns the state capital.
    @param1 rainFall The rain data array
    @param2 numWeeks The number of weeks of data
    @return average
  */
  public static double calcAverage(double rainFall[], int numWeeks)
  {
    double avg, total = 0.0;      // set variabel for total & average
    
    // calc late sum
    for (int index = 0; index < numWeeks; index++)
    {
      total += rainFall[index];
    }

    return avg = total / numWeeks;
  }

  /**
      This method calculates the highest rainfall for the year
      @param rainFall The rain fall data
      @return highest
  */
  public static double calcHighest(double rainFall[])
  {
    double highest = rainFall[0];    // set variable for highest to first element

    // loop through to find highest
    for (int index = 0; index < rainFall.length; index++)
    {
      if (rainFall[index] > highest)
        highest = rainFall[index];
    }

    return highest;
  }

  /**
      This method calculates the smallest rainfall for the year
      @param rainFall The rain fall data
      @return lowest
  */
  public static double calcLowest(double rainFall[])
  {
    double lowest = rainFall[0];     // set variable for lowest to first element

    // loop through to find lowest
    for (int index = 0; index < rainFall.length; index++)
    {
      if (rainFall[index] < lowest)
        lowest = rainFall[index];
    }

    return lowest;
  }
}
