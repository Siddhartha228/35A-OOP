package Tasks.Week3_SwitchCase;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /* 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and 
        performs the corresponding arithmetic operation using a switch case statement. */
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        sc.close();
        
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
