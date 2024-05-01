package Tasks.Week3_SwitchCase;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /* 3. Write a Java program that takes an integer input (1 to 12) representing a month 
        and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) 
        using a switch case. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the month (1 to 12): ");
        int month = sc.nextInt();
        sc.close();

        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
                break;
        }
        
        System.out.println("The season for month " + month + " is: " + season);
    }
}
