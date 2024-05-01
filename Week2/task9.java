package Tasks.Week2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        /* 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;

        int areaInt = (int) area;

        System.out.println("Area of the rectangle (type casted to int): " + areaInt);

        scanner.close();
    }
}
