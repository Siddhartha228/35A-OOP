package Tasks.Week2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /* 4. Write the ternary operator for question no. 1
         * Write a program to check whether a person can cast a vote or not. 
         * The condition is you must be over 18 years old to vote
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        if(age>18){
            System.out.println("Eligible to vote.");
        }
        else{
            System.out.println("Not eligible to vote.");
        }
    }
}
