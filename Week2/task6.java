package Tasks.Week2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /* 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        * Finally, calculate the division of the thus obtained sum and product and print the result.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        int product = num1 * num2;

        double division = (double) sum / product;

        System.out.println("Division of sum and product: " + division);

        scanner.close();
    }
}
