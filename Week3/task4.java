package Tasks.Week3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /* 4. Write a JAVA program to check whether a number is even or odd. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        sc.close();
        if (num%2==0){
            System.out.println("Even Number.");
        }
        else{
            System.out.println("Odd Number.");
        }
    }
}
