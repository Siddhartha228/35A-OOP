package Tasks.Week3_SwitchCase;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and 
        converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's grade: ");
        String grade = sc.next();
        sc.close();
        grade = grade.toUpperCase(); 

        switch (grade) {
            case "A+":
                System.out.println("GPA: 4.0");
                break;
            case "A":
                System.out.println("GPA: 3.6");
                break;
            case "B":
                System.out.println("GPA: 3.0");
                break;
            case "C":
                System.out.println("GPA: 2.0");
                break;
            case "D":
                System.out.println("GPA: 1.0");
                break;
            case "F":
                System.out.println("GPA: 0.0");
                break;
            default:
                System.out.println("Invalid grade entered.");
                break;
        }
    }
}
