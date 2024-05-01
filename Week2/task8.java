package Tasks.Week2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /* 8. Take side of a square from user and print area and perimeter of it. 
        Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
        Take the attributes as user input. */
        Scanner scanner = new Scanner(System.in);

        // Input side of square
        System.out.print("Enter the side of the square: ");
        double sideOfSquare = scanner.nextDouble();

        // Calculate area and perimeter of square
        double areaOfSquare = sideOfSquare * sideOfSquare;
        double perimeterOfSquare = 4 * sideOfSquare;

        // Output area and perimeter of square
        System.out.println("Area of the square: " + areaOfSquare);
        System.out.println("Perimeter of the square: " + perimeterOfSquare);

        // Input principal amount, rate, and time period for Simple Interest
        System.out.print("\nEnter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output Simple Interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Input base and height of triangle
        System.out.print("\nEnter the base of the triangle: ");
        double baseOfTriangle = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double heightOfTriangle = scanner.nextDouble();

        // Calculate area of triangle
        double areaOfTriangle = 0.5 * baseOfTriangle * heightOfTriangle;

        // Output area of triangle
        System.out.println("Area of the triangle: " + areaOfTriangle);

        // Input side of cube
        System.out.print("\nEnter the side of the cube: ");
        double sideOfCube = scanner.nextDouble();

        // Calculate volume of cube
        double volumeOfCube = sideOfCube * sideOfCube * sideOfCube;

        // Output volume of cube
        System.out.println("Volume of the cube: " + volumeOfCube);

        // Input dimensions of cuboid
        System.out.print("\nEnter the length of the cuboid: ");
        double lengthOfCuboid = scanner.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double widthOfCuboid = scanner.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double heightOfCuboid = scanner.nextDouble();

        // Calculate volume of cuboid
        double volumeOfCuboid = lengthOfCuboid * widthOfCuboid * heightOfCuboid;

        // Output volume of cuboid
        System.out.println("Volume of the cuboid: " + volumeOfCuboid);

        scanner.close();
    }
}
