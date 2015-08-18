// Code Listing 4-4
/**
  This program assists a technician in the process of check a substance'static
  temperature
*/

import java.util.Scanner;

public class CheckTemperature {
  public static	void main(String[] args) {
    final double MAX_TEMP = 102.5;    // Maximim temp
    double temperature;               // To hold the temperature

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the current temperature
    System.out.print("Enter the substance's Celcius temperature: ");
    temperature = keyboard.nextDouble();

    // As long as necessary, instruct the technician
    // to adjust the temperature.
    while (temperature > MAX_TEMP) {
  	  System.out.println("The temperature is too high. Turn the ");
  	  System.out.println("thermostat down and wait 5 minutes.");
  	  System.out.println("Then, take the Celcius temperature again.");
  	  System.out.print("an enter it here: ");
  	  temperature = keyboard.nextDouble();
    }

    // remind the technicia to check the temperatare again in 15 minutes
    System.out.println("The temperature is acceptable.");
    System.out.println("Check it again in 15 minutes.");
  }
}