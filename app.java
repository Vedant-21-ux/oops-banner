// level 1, Q1
    
public class StudentInfo {
    public static void main(String[] args) {

        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);

//level 1, Q2
        
public class StudentInfo {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average mark in PCM is " + average);
    }
}

//Level 1, Q3

public class DistanceConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double miles = kilometers * 1.6;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}


// Level 2, Q1

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number (floating point):");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number (floating point):");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2; // Division by zero might occur if number2 is 0

        System.out.println("The addition value of 2 numbers is: " + sum);
        System.out.println("The subtraction value of 2 numbers is: " + difference);
        System.out.println("The multiplication value of 2 numbers is: " + product);
        System.out.println("The division value of 2 numbers is: " + quotient);

        scanner.close();
    }
}


//Level 2, Q2

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base in cm:");
        double base_cm = scanner.nextDouble();

        System.out.println("Enter the height in cm:");
        double height_cm = scanner.nextDouble();

        double area_sq_cm = 0.5 * base_cm * height_cm;
        // 1 inch = 2.54 cm, so 1 sq inch = (2.54)^2 sq cm
        double area_sq_in = area_sq_cm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is: " + area_sq_in);
        System.out.println("The Area of the triangle in sq cm is: " + area_sq_cm);

        scanner.close();
    }
}


//Level 3, Q1

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheit + " in fahrenheit.");

        scanner.close();
    }
}
