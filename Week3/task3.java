package Tasks.Week3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        sc.close();
        if(num%5==0 && num%11==0){
            System.out.println("Divided by 5 and 11.");
        }
        else{
            System.out.println("Not divisible by 5 and 11.");
        }
    }
}
