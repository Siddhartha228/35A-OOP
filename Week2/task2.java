package Tasks.Week2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /* 2. Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = sc.nextFloat();
        System.out.print("Enter Time: ");
        float t = sc.nextFloat();
        System.out.print("Enter Rate: ");
        float r = sc.nextFloat();
        sc.close();
        float si = (p*t*r)/100;
        System.out.println("Simple Interest: " + si +"%");
    }
}
