package Tasks.Week3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /* 5. Write a JAVA program to check whether a year is a leap year or not. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.close();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
