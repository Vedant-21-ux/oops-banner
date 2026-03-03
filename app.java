//Level 3, Q1

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");

        // Create a celsius variable and take the temperature as user input
        double celsius = scanner.nextDouble();

        // Use the Formulae Celsius to Fahrenheit: (°C × 9/5) + 32 = °F and assign to farenheit Result
        double fahrenheit = (celsius * 9/5) + 32;

        // Print the result in the specified format
        System.out.println("The " + celsius + " celsius is " + fahrenheit + " in fahrenheit.");

        // Close the scanner
        scanner.close();
    }
}