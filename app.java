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


