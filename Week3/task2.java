package Tasks.Week3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /* 2. Write a JAVA program to check whether a number is negative, positive, or zero. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        sc.close();
        if (a> 0){
            System.out.println("The number is Positive.");
        }
        else if(a<0){
            System.out.println("The number is Negative.");
        }
        else{
            System.out.println("The number is Zero.");
        }
    }
}
