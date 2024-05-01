package Tasks.Week3_SwitchCase;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /* 4. Implement a Java program that calculates the area of different shapes 
        (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
        
        Scanner scanner = new Scanner(System.in);

        // Display options to the user
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");

        // Input choice from the user
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Calculate area of circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + circleArea);
                break;
            case 2:
                // Calculate area of rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
            case 3:
                // Calculate area of square
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of the square: " + squareArea);
                break;
            case 4:
                // Calculate area of triangle
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the triangle: " + triangleArea);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
